package com.example.weatherapp.domain.model

/**
 * Created by Vazhapp on 05.09.2022
 */
data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
