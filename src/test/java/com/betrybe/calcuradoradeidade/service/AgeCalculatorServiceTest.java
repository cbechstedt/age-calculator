package com.betrybe.calcuradoradeidade.service;

import com.betrybe.calcuradoradeidade.exception.FutureDateException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AgeCalculatorServiceTest {

  @InjectMocks
  private AgeCalculatorService ageCalculatorService;

  private DateTimeFormatter formatter;

  @BeforeEach
  public void setup() {
    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
  }

  @Test
  public void testCalculateAgeWhenDateIsPastThenReturnCorrectAge() {
    // Arrange
    String pastDate = LocalDate.now().minusYears(20).format(formatter);

    // Act
    int age = ageCalculatorService.calculateAge(pastDate);

    // Assert
    Assertions.assertEquals(20, age);
  }

  @Test
  public void testCalculateAgeWhenDateIsFutureThenThrowException() {
    // Arrange
    String futureDate = LocalDate.now().plusYears(1).format(formatter);

    // Act & Assert
    Assertions.assertThrows(FutureDateException.class,
        () -> ageCalculatorService.calculateAge(futureDate));
  }

  @Test
  public void testCalculateAgeWhenDateIsTodayThenReturnZero() {
    // Arrange
    String todayDate = LocalDate.now().format(formatter);

    // Act
    int age = ageCalculatorService.calculateAge(todayDate);

    // Assert
    Assertions.assertEquals(0, age);
  }
}