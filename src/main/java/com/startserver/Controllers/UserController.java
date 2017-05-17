package com.startserver.Controllers;


import com.startserver.Entity.User;
import com.startserver.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.enterprise.inject.Model;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/signin", method = RequestMethod.POST, consumes = "application/json", produces = "application/json", headers = "content-type=application/x-www-form-urlencoded")
    @ResponseBody
    public ResponseEntity<User> getUserByLoginAndPassword(@RequestBody User user) {
        return new ResponseEntity<User>(userService.getUserByLoginAndPassword(user.getLogin(), user.getPassword()), HttpStatus.OK);
    }

    @RequestMapping(value = "/savenew", method = RequestMethod.POST, consumes = "application/json", produces = "application/json", headers = "content-type=application/x-www-form-urlencoded")
    public ResponseEntity<User> saveNewUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.saveNewUser(user), HttpStatus.OK);
    }

}
