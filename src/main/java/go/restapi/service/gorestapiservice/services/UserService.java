package go.restapi.service.gorestapiservice.services;

import go.restapi.service.gorestapiservice.model.UserData;
import go.restapi.service.gorestapiservice.model.UserDataRequest;
import go.restapi.service.gorestapiservice.model.UserDataRequestNames;

public interface UserService {

    UserData createUser(UserDataRequest userDataRequest);

    UserData updateUserNames(String userId, UserDataRequestNames userDataRequestNames);

    UserData getUser(String userId);

}
