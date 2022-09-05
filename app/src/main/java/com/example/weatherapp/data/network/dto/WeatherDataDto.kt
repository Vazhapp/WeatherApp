package com.example.weatherapp.data.network.dto

import com.squareup.moshi.Json

/**
 * Created by Vazhapp on 05.09.2022
 */
data class WeatherDataDto(
    val time: List<String>,
    @field:Json(name = "temperature_2m")
    val temperature: List<Double>,
    @field:Json(name = "weathercode")
    val weatherCodes: List<Int>,
    @field:Json(name = "pressure_msl")
    val pressures: List<Double>,
    @field:Json(name = "windspeed_10m")
    val windSpeed: List<Double>,
    @field:Json(name = "relativehumidity_2m")
    val humidities: List<Double>
)
