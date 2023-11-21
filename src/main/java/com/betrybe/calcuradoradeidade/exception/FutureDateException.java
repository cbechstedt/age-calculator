package com.betrybe.calcuradoradeidade.exception;

/**
 * Exception to future date in RequestParam.
 */
public class FutureDateException extends RuntimeException {

  public FutureDateException(String message) {
    super(message);
  }
}
