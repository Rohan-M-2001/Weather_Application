package com.example.Weather.Forecast.Service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "weather.api")
public class WeatherApiProperties {

  private String apiKey;

  public String getApiKey() {

    return this.apiKey;
  }

  public void setApiKey(String apiKey) {

    this.apiKey = apiKey;
  }
}
