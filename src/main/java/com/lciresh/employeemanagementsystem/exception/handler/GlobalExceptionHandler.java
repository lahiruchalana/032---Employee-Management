package com.lciresh.employeemanagementsystem.exception.handler;

import com.lciresh.employeemanagementsystem.exception.NoDataAvailableException;
import com.lciresh.employeemanagementsystem.exception.model.CommonExceptionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoDataAvailableException.class)
    public ResponseEntity<Object> handleNoDataAvailableException(NoDataAvailableException e) {
        CommonExceptionModel commonExceptionModel = new CommonExceptionModel(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), "data.not-available");

        return new ResponseEntity<>(commonExceptionModel, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}