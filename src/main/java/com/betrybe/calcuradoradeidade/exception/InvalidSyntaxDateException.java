package com.betrybe.calcuradoradeidade.exception;

/**
 * Exception to invalid date format in RequestParam.
 */
public class InvalidSyntaxDateException extends RuntimeException {

  public InvalidSyntaxDateException(String message) {
    super(message);
  }
}
