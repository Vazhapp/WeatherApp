package com.example.weatherapp.domain.model

import com.example.weatherapp.util.weather.WeatherType
import java.time.LocalDateTime

/**
 * Created by Vazhapp on 05.09.2022
 */
data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType,
)
