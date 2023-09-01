package com.example.Weather.Forecast.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "weather-api")
public interface WeatherApiFeignClient {

  @GetMapping("/rest/services/timeline/{location}/{startDate}/{endDate}?key=${weather.api.apiKey}")
  String getWeatherForecast(@PathVariable("location") String location, @PathVariable("startDate") String startDate,
      @PathVariable("endDate") String endDate);
}
