package com.cloud.cloud.controllers.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class UserSignUpReqeust {
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private String password;
}
