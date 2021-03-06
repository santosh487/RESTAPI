package com.example.demo.controller;

import com.example.demo.dto.ResponseDto;

public class BaseController {
    public ResponseDto successResponse(String message, Object data) {
        return  ResponseDto.builder()
                .status(true)
                .message(message)
                .data(data)
                .build();
    }

    public ResponseDto errorResponse(String message, Object data) {
        return  ResponseDto.builder()
                .status(false)
                .message(message)
                .data(data)
                .build();

    }
}
