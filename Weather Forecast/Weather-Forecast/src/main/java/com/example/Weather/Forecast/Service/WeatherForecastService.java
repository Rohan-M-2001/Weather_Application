package com.example.Weather.Forecast.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Weather.Forecast.feign.WeatherApiFeignClient;

@Service
public class WeatherForecastService {

  private final WeatherApiFeignClient weatherApiFeignClient;

  @Autowired
  public WeatherForecastService(WeatherApiFeignClient weatherApiFeignClient) {

    this.weatherApiFeignClient = weatherApiFeignClient;
  }

  public String getWeatherForecastForLocationAndDates(String location, String startDate, String endDate) {

    return this.weatherApiFeignClient.getWeatherForecast(location, startDate, endDate);
  }
}
