package com.cloud.cloud.mappers;

import com.cloud.cloud.controllers.request.UserSignUpReqeust;
import com.cloud.cloud.dtos.FindUserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Mapper
@Repository
public interface UserMapper{
    FindUserDto selectByEmail(String email);
    void saveUser(UserSignUpReqeust usur);
}
