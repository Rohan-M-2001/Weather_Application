package com.example.Weather.Data.Exception;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
  /**
   * @return status
   */
  public HttpStatus getStatus() {

    return this.status;
  }

  /**
   * @param status new value of {@link #getstatus}.
   */
  public void setStatus(HttpStatus status) {

    this.status = status;
  }

  /**
   * @return message
   */
  public String getMessage() {

    return this.message;
  }

  /**
   * @param message new value of {@link #getmessage}.
   */
  public void setMessage(String message) {

    this.message = message;
  }

  private HttpStatus status;

  private String message;

  public ErrorResponse(HttpStatus status, String message) {

    this.status = status;
    this.message = message;
  }

}
