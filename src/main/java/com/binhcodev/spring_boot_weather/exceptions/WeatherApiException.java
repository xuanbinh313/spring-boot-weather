package com.binhcodev.spring_boot_weather.exceptions;

public class WeatherApiException extends RuntimeException{
    public WeatherApiException(String message) {
        super(message);
    }

    public WeatherApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
