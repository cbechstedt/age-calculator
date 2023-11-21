package com.betrybe.calcuradoradeidade.service;

import com.betrybe.calcuradoradeidade.exception.FutureDateException;
import java.time.LocalDate;
import java.time.Period;
import org.springframework.stereotype.Service;

/**
 * Service.
 */
@Service
public class AgeCalculatorService {

  /**
   * calculateAge.
   */
  public int calculateAge(String date) {
    LocalDate today = LocalDate.now();
    LocalDate dateParsed = LocalDate.parse(date);
    Period period = Period.between(dateParsed, today);
    if (period.isNegative()) {
      throw new FutureDateException("This is a future date.");
    }
    return period.getYears();
  }

  public int calculateAgeWithDefault(String date, int defaultAge) {
    // TODO method implementation
    return -1;
  }
}
