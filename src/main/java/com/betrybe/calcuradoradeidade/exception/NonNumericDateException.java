package com.betrybe.calcuradoradeidade.exception;

/**
 * Exception to non-numeric date format in RequestParam.
 */
public class NonNumericDateException extends RuntimeException {
  
  public NonNumericDateException(String message) {
    super(message);
  }
}
