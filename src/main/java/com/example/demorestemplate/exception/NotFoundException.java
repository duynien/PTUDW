package com.example.demorestemplate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestClientException;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "not found")
public class NotFoundException extends RestClientException {
  public NotFoundException(String msg) {
    super(msg);
  }
}
