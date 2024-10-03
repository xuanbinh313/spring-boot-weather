package com.binhcodev.spring_boot_weather.entities;

import java.util.ArrayList;

public class WeatherResponse {
    public int queryCost;
    public double latitude;
    public double longitude;
    public String resolvedAddress;
    public String address;
    public String timezone;
    public double tzoffset;
    public String description;
    public ArrayList<Day> days;
    public ArrayList<Object> alerts;
    public Stations stations;
    public CurrentConditions currentConditions;
}
