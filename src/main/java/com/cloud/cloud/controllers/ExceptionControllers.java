package com.cloud.cloud.controllers;

import com.cloud.cloud.controllers.response.DefaultResponse;
import com.cloud.cloud.controllers.response.StatusCode;
import com.cloud.cloud.exceptions.UserConflictException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllers {
    @ExceptionHandler(UserConflictException.class)
    public ResponseEntity<DefaultResponse> conflictUser(UserConflictException uce){
        return new ResponseEntity<DefaultResponse>(DefaultResponse.builder().statusCode(StatusCode.CONFLICT).build(), HttpStatus.OK);
    }
}
