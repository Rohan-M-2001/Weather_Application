package com.example.Weather.Forecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.example.Weather.Forecast.Service")
public class WeatherForecastApplication {

  public static void main(String[] args) {

    SpringApplication.run(WeatherForecastApplication.class, args);
  }

}
