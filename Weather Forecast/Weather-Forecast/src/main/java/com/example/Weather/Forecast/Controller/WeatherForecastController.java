package com.example.Weather.Forecast.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Weather.Forecast.Exception.WeatherServiceException;
import com.example.Weather.Forecast.Service.WeatherForecastService;

@RestController
@CrossOrigin(origins = "http://localhost:8084")
@RequestMapping("/api/weather-forecast")
public class WeatherForecastController {

  private final WeatherForecastService weatherForecastService;

  @Autowired
  public WeatherForecastController(WeatherForecastService weatherForecastService) {

    this.weatherForecastService = weatherForecastService;
  }

  @GetMapping("/{location}/{startDate}/{endDate}")
  public String getWeatherForecast(@PathVariable String location, @PathVariable String startDate,
      @PathVariable String endDate) {

    try {
      return this.weatherForecastService.getWeatherForecastForLocationAndDates(location, startDate, endDate);
    } catch (WeatherServiceException e) {
      return "Error occurred: " + e.getMessage();
    }
  }
}
