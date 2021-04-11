package com.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthencationResponse {
    private final String jwt;

}
