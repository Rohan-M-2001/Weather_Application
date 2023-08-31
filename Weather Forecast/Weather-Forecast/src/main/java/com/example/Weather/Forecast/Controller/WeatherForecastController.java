package com.example.Weather.Forecast.Controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Weather.Forecast.Model.WeatherForecastResponse;
import com.example.Weather.Forecast.Service.WeatherForecastService;

@CrossOrigin(origins = "*")
@RestController
// @RequestMapping("/weather-forecasts")
public class WeatherForecastController {

  @Autowired
  private WeatherForecastService weatherForecastService;

  @GetMapping("/forecast/{location}/{date1}/{date2}")
  public ResponseEntity<WeatherForecastResponse> getWeatherForecast(@PathVariable String location,
      @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date1,
      @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date2) {

    WeatherForecastResponse forecasts = this.weatherForecastService.getWeatherForecast(location, date1, date2);
    return ResponseEntity.ok(forecasts);
  }
}
