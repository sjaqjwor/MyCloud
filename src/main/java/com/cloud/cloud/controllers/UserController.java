package com.cloud.cloud.controllers;

import com.cloud.cloud.controllers.request.UserSignUpReqeust;
import com.cloud.cloud.controllers.response.DefaultResponse;
import com.cloud.cloud.controllers.response.StatusCode;
import com.cloud.cloud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserService us;

    @PostMapping("/sign/up")
    public ResponseEntity<DefaultResponse> signUp(@Valid @RequestBody UserSignUpReqeust usur){
        us.signUp(usur);
        return new ResponseEntity<>(DefaultResponse.builder().statusCode(StatusCode.OK).build(), HttpStatus.OK);
    }
}
