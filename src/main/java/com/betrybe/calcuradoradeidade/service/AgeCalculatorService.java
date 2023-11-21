package com.betrybe.calcuradoradeidade.service;

import java.time.LocalDate;
import java.time.Period;
import org.springframework.stereotype.Service;

@Service
public class AgeCalculatorService {

  /**
   * calculateAge.
   */
  public int calculateAge(String date) {
    LocalDate today = LocalDate.now();
    LocalDate dateParsed = LocalDate.parse(date);
    Period period = Period.between(dateParsed, today);
    return period.getYears();
  }

  public int calculateAgeWithDefault(String date, int defaultAge) {
    // TODO method implementation
    return -1;
  }
}
