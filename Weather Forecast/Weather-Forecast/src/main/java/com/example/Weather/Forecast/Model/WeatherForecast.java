package com.example.Weather.Forecast.Model;

import java.time.LocalDate;

public class WeatherForecast {
  private LocalDate date;

  private double temperature;

  private String condition;

  public WeatherForecast() {

  }

  public WeatherForecast(LocalDate date, double temperature, String condition) {

    this.date = date;
    this.temperature = temperature;
    this.condition = condition;
  }

  /**
   * @return date
   */
  public LocalDate getDate() {

    return this.date;
  }

  /**
   * @param date new value of {@link #getdate}.
   */
  public void setDate(LocalDate date) {

    this.date = date;
  }

  /**
   * @return temperature
   */
  public double getTemperature() {

    return this.temperature;
  }

  /**
   * @param temperature new value of {@link #gettemperature}.
   */
  public void setTemperature(double temperature) {

    this.temperature = temperature;
  }

  /**
   * @return condition
   */
  public String getCondition() {

    return this.condition;
  }

  /**
   * @param condition new value of {@link #getcondition}.
   */
  public void setCondition(String condition) {

    this.condition = condition;
  }

}
