package com.binhcodev.spring_boot_weather;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.binhcodev.spring_boot_weather.entities.WeatherResponse;

@Service
public class WeatherService {
    private final String API_KEY = "4A2NL9DJF8B8HFCGFWUSPVKA3";
    private final String apiURL = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/Vietnam?unitGroup=metric&key=" + API_KEY + "&contentType=json";

    public WeatherResponse getWeather(String country) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(apiURL, WeatherResponse.class);
        return response.getBody();
    }
}
