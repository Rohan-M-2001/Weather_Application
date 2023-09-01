package com.example.Weather.Forecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = { "com.example.Weather.Forecast.Service", "com.example.Weather.Forecast.Controller" })
public class WeatherForecastApplication {

  public static void main(String[] args) {

    SpringApplication.run(WeatherForecastApplication.class, args);
  }

}
