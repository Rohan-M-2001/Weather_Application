package com.example.Weather.Data.Model;

public class WeatherData {
  private Double temperature;

  private String weather_descriptions;

  /**
   * @return temperature
   */
  public Double getTemperature() {

    return this.temperature;
  }

  /**
   * @param temperature new value of {@link #gettemperature}.
   */
  public void setTemperature(Double temperature) {

    this.temperature = temperature;
  }

  /**
   * @return weather_descriptions
   */
  public String getWeather_descriptions() {

    return this.weather_descriptions;
  }

  /**
   * @param weather_descriptions new value of {@link #getweather_descriptions}.
   */
  public void setWeather_descriptions(String weather_descriptions) {

    this.weather_descriptions = weather_descriptions;
  }

}