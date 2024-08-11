package com.vuthehuyht.comicsapp.exceptions;

import com.vuthehuyht.comicsapp.enums.ErrorCode;
import com.vuthehuyht.comicsapp.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(BookNotFoundException.class)
    ResponseEntity<ApiResponse> handleBookNotFoundException(BookNotFoundException e) {
        ErrorCode errorCode = e.getErrorCode();

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(errorCode.getCode());
        apiResponse.setMessage(errorCode.getMessage());

        log.error("BookNotFoundException {}", e.getMessage());
        return ResponseEntity.status(errorCode.getStatusCode()).body(apiResponse);
    }
}
