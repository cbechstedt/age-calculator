package com.betrybe.calcuradoradeidade.service;

import com.betrybe.calcuradoradeidade.exception.FutureDateException;
import com.betrybe.calcuradoradeidade.exception.InvalidSyntaxDateException;
import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    validateDatePattern(date);
    LocalDate today = LocalDate.now();
    LocalDate dateParsed = LocalDate.parse(date);
    Period period = Period.between(dateParsed, today);
    if (period.isNegative()) {
      throw new FutureDateException("This is a future date.");
    }
    return period.getYears();
  }

  /**
   * validateDatePattern.
   */
  public void validateDatePattern(String date) {
    String datePattern = "\\d{4}-\\d{2}-\\d{2}";
    Pattern pattern = Pattern.compile(datePattern);
    Matcher matcher = pattern.matcher(date);
    boolean isValid = matcher.matches();

    if (!isValid) {
      throw new InvalidSyntaxDateException("Invalid date format. Expected aa-mm-dd.");
    }
  }

  public int calculateAgeWithDefault(String date, int defaultAge) {
    // TODO method implementation
    return -1;
  }
}
