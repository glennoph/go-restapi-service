package go.restapi.service.gorestapiservice.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        log.info("get users");
        return "get users called";
    }

    @PostMapping
    public String createUser() {
        log.info("create user");
        return "create user called";
    }

    @PutMapping
    public String updateUser() {
        log.info("update user");
        return "update user called";
    }

    @DeleteMapping
    public String deleteUser() {
        log.info("delete user");
        return "delete user called";
    }

}
