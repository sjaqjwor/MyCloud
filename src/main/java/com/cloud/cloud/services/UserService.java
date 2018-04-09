package com.cloud.cloud.services;

import com.cloud.cloud.configs.Encriptor;
import com.cloud.cloud.controllers.request.UserSignUpReqeust;
import com.cloud.cloud.dtos.FindUserDto;
import com.cloud.cloud.exceptions.UserConflictException;
import com.cloud.cloud.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserMapper um;

    public void signUp(UserSignUpReqeust usur) throws Exception{
        if(um.selectByEmail(usur.getEmail())!=null){
            throw new UserConflictException();
        }
        usur.setPassword(Encriptor.sha256(usur.getPassword()));
        um.saveUser(usur);
    }
}
