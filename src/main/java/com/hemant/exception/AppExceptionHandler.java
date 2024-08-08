package com.hemant.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = CustomerNotFoundException.class)
    public ResponseEntity<ExceptionData> getExceptionData(CustomerNotFoundException cnfe){

        ExceptionData data = new ExceptionData();
        data.setCode("101");
        data.setMessage(cnfe.getMessage());
        data.setDate(LocalDateTime.now());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);

    }
}
