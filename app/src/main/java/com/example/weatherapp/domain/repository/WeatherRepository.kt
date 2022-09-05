package com.example.weatherapp.domain.repository

import com.example.weatherapp.domain.model.WeatherInfo

/**
 * Created by Vazhapp on 05.09.2022
 */
interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): WeatherInfo
}