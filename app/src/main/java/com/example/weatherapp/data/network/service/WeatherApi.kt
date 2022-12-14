package com.example.weatherapp.data.network.service

import com.example.weatherapp.data.network.dto.WeatherDto
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Vazhapp on 05.09.2022
 */
interface WeatherApi {

    @GET("v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m,relativehumidity_2m")
    suspend fun getWeatherData(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
    ): WeatherDto

}