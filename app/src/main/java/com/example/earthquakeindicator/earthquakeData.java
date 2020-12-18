package com.example.earthquakeindicator;

public class earthquakeData {
    private final double magnitude;
    private final String city;
    private final String date;
    private final String time;

    earthquakeData(double magnitude, String city, String date, String time) {
        this.magnitude = magnitude;
        this.city = city;
        this.date = date;
        this.time = time;
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    public String getCity() {
        return this.city;
    }

    public String getDate() {
        return this.date;
    }

    public String getTime() {return  this.time;}
}
