package com.example.earthquakeindicator;

public class earthquakeData {
    private final String magnitude;
    private final String city;
    private final String date;

    earthquakeData(String magnitude, String city, String date) {
        this.magnitude = magnitude;
        this.city = city;
        this.date = date;
    }

    public String getMagnitude() {
        return this.magnitude;
    }

    public String getCity() {
        return this.city;
    }

    public String getDate() {
        return this.date;
    }
}
