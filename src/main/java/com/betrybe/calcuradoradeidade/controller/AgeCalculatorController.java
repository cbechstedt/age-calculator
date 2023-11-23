package com.betrybe.calcuradoradeidade.controller;

import com.betrybe.calcuradoradeidade.dto.DateDto;
import com.betrybe.calcuradoradeidade.service.AgeCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller.
 */
@RestController
@RequestMapping("/calculateAge")
public class AgeCalculatorController implements AgeCalculatorControllerInterface {

  private final AgeCalculatorService ageCalculatorService;

  @Autowired
  public AgeCalculatorController(AgeCalculatorService ageCalculatorService) {
    this.ageCalculatorService = ageCalculatorService;
  }

  @GetMapping
  @Override
  public ResponseEntity<DateDto> calculateAge(String date, String orDefaultAge) {
    if (orDefaultAge != null) {
      int age = ageCalculatorService.calculateAgeWithDefault(date, Integer.parseInt(orDefaultAge));
      return ResponseEntity.ok(new DateDto(age));
    }

    int age = ageCalculatorService.calculateAge(date);
    return ResponseEntity.ok(new DateDto(age));
  }
}
