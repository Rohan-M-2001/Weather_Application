package com.example.Weather.Forecast.Model;

import java.util.List;

public class WeatherForecastResponse {
  private List<WeatherForecast> forecasts;

  /**
   * @return forecasts
   */
  public List<WeatherForecast> getForecasts() {

    return this.forecasts;
  }

  /**
   * @param forecasts new value of {@link #getforecasts}.
   */
  public void setForecasts(List<WeatherForecast> forecasts) {

    this.forecasts = forecasts;
  }

  /**
   * The constructor.
   *
   * @param forecasts
   */
  public WeatherForecastResponse(List<WeatherForecast> forecasts) {

    super();
    this.forecasts = forecasts;
  }

}
