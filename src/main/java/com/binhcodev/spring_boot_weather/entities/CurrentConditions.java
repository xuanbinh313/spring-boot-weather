package com.binhcodev.spring_boot_weather.entities;

import java.util.ArrayList;

public class CurrentConditions {
    public String datetime;
    public int datetimeEpoch;
    public double temp;
    public double feelslike;
    public double humidity;
    public double dew;
    public Object precip;
    public double precipprob;
    public double snow;
    public double snowdepth;
    public Object preciptype;
    public Object windgust;
    public double windspeed;
    public double winddir;
    public double pressure;
    public double visibility;
    public double cloudcover;
    public double solarradiation;
    public double solarenergy;
    public double uvindex;
    public String conditions;
    public String icon;
    public ArrayList<String> stations;
    public String source;
    public String sunrise;
    public int sunriseEpoch;
    public String sunset;
    public int sunsetEpoch;
    public double moonphase;
}
