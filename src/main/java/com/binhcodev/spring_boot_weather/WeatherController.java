package com.binhcodev.spring_boot_weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.binhcodev.spring_boot_weather.entities.WeatherResponse;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public WeatherResponse getWeather(@RequestParam String country){
        return weatherService.getWeather(country);
    }
}
