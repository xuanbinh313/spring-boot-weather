package com.binhcodev.spring_boot_weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.binhcodev.spring_boot_weather.entities.WeatherResponse;

@Service
public class WeatherService {
    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);
    private final String API_KEY = "4A2NL9DJF8B8HFCGFWUSPVKA3";
    private final String apiURL = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/Vietnam?unitGroup=metric&key=" + API_KEY + "&contentType=json";

    @Cacheable(value = "WeatherCache", key = "#country")
    public WeatherResponse getWeather(String country) {
        // This log will only appear when a new request is made (i.e., cache miss)
        logger.info("Fetching new data from weather API for city: {}", country);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(apiURL, WeatherResponse.class);
        return response.getBody();
    }
}
