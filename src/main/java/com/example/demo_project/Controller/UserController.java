package com.example.demo_project.Controller;

import com.example.demo_project.DTOs.User;
import com.example.demo_project.Exceptions.BusinessValidationException;
import com.example.demo_project.Request.CreateUserRequest;
import com.example.demo_project.Request.InquireUserRequest;
import com.example.demo_project.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//asıl metotları save, delete, service in içinde yazıp
//controllerda bunu çağırarak kullanıyoruz
//Controller - API İşlemlerini Yöneten Katman

@RestController
@RequestMapping("/gokce")
public class UserController {

//delete,save,...
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/getUser")
    public ResponseEntity<User> getUser(@RequestBody InquireUserRequest inquireUserRequest) {
        return ResponseEntity.ok(userService.inquireUser(inquireUserRequest));
    }

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody CreateUserRequest createUserRequest) throws BusinessValidationException {
        return ResponseEntity.ok(userService.createUser(createUserRequest));
    }


}
