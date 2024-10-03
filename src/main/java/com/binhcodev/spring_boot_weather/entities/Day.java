package com.binhcodev.spring_boot_weather.entities;

import java.util.ArrayList;

public class Day{
    public String datetime;
    public int datetimeEpoch;
    public double tempmax;
    public double tempmin;
    public double temp;
    public double feelslikemax;
    public double feelslikemin;
    public double feelslike;
    public double dew;
    public double humidity;
    public double precip;
    public double precipprob;
    public double precipcover;
    public ArrayList<String> preciptype;
    public double snow;
    public double snowdepth;
    public double windgust;
    public double windspeed;
    public double winddir;
    public double pressure;
    public double cloudcover;
    public double visibility;
    public double solarradiation;
    public double solarenergy;
    public double uvindex;
    public double severerisk;
    public String sunrise;
    public int sunriseEpoch;
    public String sunset;
    public int sunsetEpoch;
    public double moonphase;
    public String conditions;
    public String description;
    public String icon;
    public ArrayList<String> stations;
    public String source;
    public ArrayList<Hour> hours;
}