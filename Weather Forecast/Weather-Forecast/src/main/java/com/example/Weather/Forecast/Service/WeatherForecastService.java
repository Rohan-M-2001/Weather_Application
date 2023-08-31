package com.example.Weather.Forecast.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Weather.Forecast.Exception.CustomException;
import com.example.Weather.Forecast.Model.WeatherForecastResponse;

@Service
public class WeatherForecastService {

  @Value("${visualcrossing.api.key}")
  private String apiKey;

  private final RestTemplate restTemplate = new RestTemplate();

  public WeatherForecastResponse getWeatherForecast(String location, LocalDate date1, LocalDate date2) {

    String apiUrl = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + location
        + "/" + date1 + "/" + date2 + "?key=" + this.apiKey;

    ResponseEntity<WeatherForecastResponse> responseEntity = this.restTemplate.exchange(apiUrl, HttpMethod.GET, null,
        WeatherForecastResponse.class);

    if (responseEntity.getStatusCode() == HttpStatus.OK) {
      WeatherForecastResponse response = responseEntity.getBody();
      if (response != null) {
        return response;
      }
    }

    throw new CustomException("Failed to fetch weather forecast.");
  }
}
