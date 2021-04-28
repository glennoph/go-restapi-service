package go.restapi.service.gorestapiservice.services.impl;

import go.restapi.service.gorestapiservice.common.UserUtil;
import go.restapi.service.gorestapiservice.model.UserData;
import go.restapi.service.gorestapiservice.model.UserDataRequest;
import go.restapi.service.gorestapiservice.model.UserDataRequestNames;
import go.restapi.service.gorestapiservice.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    Map<String, UserData> users;
    UserUtil userUtil;

    public UserServiceImpl() {}

    @Autowired
    public UserServiceImpl(UserUtil userUtil) {
        this.userUtil = userUtil;
    }

    @Override
    public UserData createUser(UserDataRequest userDataRequest) {
        log.info("createUser str");
        UserData userData = new UserData();
        userData.setFirstName(userDataRequest.getFirstName());
        userData.setLastName(userDataRequest.getLastName());
        userData.setEmail(userDataRequest.getEmail());
        userData.setUserId(userUtil.generateId());

        // add to users map
        if (users == null) users = new HashMap<>();
        log.info("add userData to users map");
        users.put(userData.getUserId(), userData);

        return userData;
    }

    @Override
    public UserData updateUserNames(String userId,
                                    UserDataRequestNames userDataRequestNames) {
        log.info("update user names id="+userId+" names="+userDataRequestNames);
        UserData userData = users.get(userId);
        log.info("located userdata "+userData.toString());
        userData.setFirstName(userDataRequestNames.getFirstName());
        userData.setLastName(userDataRequestNames.getLastName());
        log.info("updated userdata "+userData.toString());
        return userData;
    }

    @Override
    public UserData getUser(String userId) {
        log.info("getUser userId="+userId);
        UserData userData = users.get(userId);
        log.info("return userData="+userData.toString());
        return userData;
    }
}
