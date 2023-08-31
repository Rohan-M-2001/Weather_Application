package com.example.Weather.Data.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(WeatherServiceException.class)
  protected ResponseEntity<Object> handleWeatherServiceException(WeatherServiceException ex, WebRequest request) {

    // Create a custom error response object
    ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    return buildResponseEntity(errorResponse);
  }

  private ResponseEntity<Object> buildResponseEntity(ErrorResponse errorResponse) {

    return new ResponseEntity<>(errorResponse, errorResponse.getStatus());
  }
}
