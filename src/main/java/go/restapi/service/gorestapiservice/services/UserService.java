package go.restapi.service.gorestapiservice.services;

import go.restapi.service.gorestapiservice.model.UserData;
import go.restapi.service.gorestapiservice.model.UserDataRequest;

public interface UserService {

    UserData createUser(UserDataRequest userDataRequest);

    UserData getUser(String userId);

}
