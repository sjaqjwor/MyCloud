package com.cloud.cloud.controllers.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DefaultResponse {
    private String data;
    private String message;
    private StatusCode statusCode;
}
