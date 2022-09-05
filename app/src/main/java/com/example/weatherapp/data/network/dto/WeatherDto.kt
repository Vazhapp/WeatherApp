package com.example.weatherapp.data.network.dto

import com.squareup.moshi.Json

/**
 * Created by Vazhapp on 05.09.2022
 */
data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
