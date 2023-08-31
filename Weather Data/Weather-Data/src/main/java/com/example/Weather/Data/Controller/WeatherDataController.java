package com.example.Weather.Data.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Weather.Data.Service.WeatherDataService;

@CrossOrigin(origins = "*")
@RestController
public class WeatherDataController {

  @Autowired
  private WeatherDataService weatherDataService;

  @GetMapping("/current")
  public ResponseEntity<String> getCurrentWeather(@RequestParam String location) {

    String weatherInfo = this.weatherDataService.getCurrentWeather(location);
    return ResponseEntity.ok(weatherInfo);
  }
}
