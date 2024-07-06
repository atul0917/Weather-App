package com.om.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherService {
    private final String API_KEY = "f57e22863f955e23ee7d42ea7086f687"; // Your actual API key
    private final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";

    public String getWeather(String city) {
        String url = String.format(BASE_URL, city, API_KEY);
        System.out.println("Request URL: " + url); // Print the URL for debugging
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
