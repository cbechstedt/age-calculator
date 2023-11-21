package com.betrybe.calcuradoradeidade.controller;

import com.betrybe.calcuradoradeidade.dto.ErrorMessageDto;
import com.betrybe.calcuradoradeidade.exception.FutureDateException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ControllerAdvice.
 */
@ControllerAdvice
public class ControllerAdviceHandler {

  @ExceptionHandler(FutureDateException.class)
  public ResponseEntity<ErrorMessageDto> handleAgeFutureDate(RuntimeException e) {
    return ResponseEntity.unprocessableEntity().body(new ErrorMessageDto(e.getMessage()));
  }
}
