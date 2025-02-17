package com.om.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.om.service.WeatherService;

@RestController
public class WeatherController {
	 @Autowired
	    private WeatherService weatherService;

	    @GetMapping("/weather/{city}")
	    public String getWeather(@PathVariable String city) {
	        return weatherService.getWeather(city);
}
}
