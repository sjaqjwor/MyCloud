package com.cloud.cloud.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientMessage {
    String name;
    String contents;
}
