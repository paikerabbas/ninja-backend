package org.ninja.user;

import org.ninja.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/registerUser", produces = "application/json", consumes = "application/json")
    public ResponseEntity<User> registerUser(@RequestBody User user) {

        return new ResponseEntity<>(userService.registerUser(user), HttpStatus.OK);

    }

}
