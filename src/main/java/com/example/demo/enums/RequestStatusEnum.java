package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RequestStatusEnum {
    FAILURE("RS_01"),
    SUCCESS("RS_02");
    @Getter
    private String response;
}
