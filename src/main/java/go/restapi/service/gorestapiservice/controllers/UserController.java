package go.restapi.service.gorestapiservice.controllers;

import go.restapi.service.gorestapiservice.model.UserData;
import go.restapi.service.gorestapiservice.model.UserDataRequest;
import go.restapi.service.gorestapiservice.model.UserDataRequestNames;
import go.restapi.service.gorestapiservice.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUsers() {
        log.info("get users");
        return "get users called";
    }

    @GetMapping(path="/{userId}")
    public UserData getUser(@PathVariable String userId) {
        log.info("get user id="+userId);
        UserData userData = userService.getUser(userId);
        return userData;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    public UserData createUser(
            @Valid
            @RequestBody UserDataRequest userDataRequest) {
        log.info("create user 1 from userDataRequest="+userDataRequest.toString());
        //return "create user called";
        UserData userData = userService.createUser(userDataRequest);
        log.info("create user 2 -- userData="+userData.toString());
        return userData;
    }

    @PutMapping(path="/{userId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UserData updateUserNames(@PathVariable String userId,
                             @Valid
                             @RequestBody UserDataRequestNames userDataRequestNames) {
        log.info("update user id="+userId);
        UserData userData = userService.updateUserNames(userId, userDataRequestNames);
        log.info("completed");
        return userData;
    }

    @DeleteMapping(path="/{userId}")
    public String deleteUser(@PathVariable String userId) {
        log.info("delete user id="+userId);
        return "delete user called id="+userId;
    }

}
