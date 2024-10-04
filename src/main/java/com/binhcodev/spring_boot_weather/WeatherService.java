package com.binhcodev.spring_boot_weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.binhcodev.spring_boot_weather.entities.WeatherResponse;
import com.binhcodev.spring_boot_weather.exceptions.WeatherApiException;

@Service
public class WeatherService {
    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);
    @Value("${weather.api.key}")
    private String API_KEY;
    @Value("${weather.api.url}")
    private String apiURL;

    @Cacheable(value = "WeatherCache", key = "#country")
    public WeatherResponse getWeather(String country) {
        // This log will only appear when a new request is made (i.e., cache miss)
        logger.info("Fetching new data from weather API for country: {}", country);
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(apiURL + country + "?key=" + API_KEY, WeatherResponse.class);
            return response.getBody();
        } catch (RestClientException e) {
            // Handle 4xx and 5xx HTTP errors from the API
            throw new WeatherApiException("Failed to fetch weather data for country: " + country, e);
        } 
    }
}
