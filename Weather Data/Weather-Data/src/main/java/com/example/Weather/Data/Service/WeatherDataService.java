package com.example.Weather.Data.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherDataService {

  @Value("${weatherstack.api.key}")
  private String apiKey;

  public String getCurrentWeather(String location) {

    String apiUrl = "http://api.weatherstack.com/current?access_key=" + this.apiKey + "&query=" + location;

    RestTemplate restTemplate = new RestTemplate();
    String response = restTemplate.getForObject(apiUrl, String.class);
    return response;
  }
}