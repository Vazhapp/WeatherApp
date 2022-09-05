package com.example.weatherapp.domain.usecase

import com.example.weatherapp.domain.model.WeatherInfo
import com.example.weatherapp.domain.repository.WeatherRepository
import com.example.weatherapp.util.Resource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Created by Vazhapp on 05.09.2022
 */
class GetWeatherInfoUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) {

    suspend fun execute(
        latitude: Double,
        longitude: Double
    ): Flow<Resource<WeatherInfo>> = withContext(ioDispatcher) {
        flow {
            try {
                emit(Resource.Loading())
                val weatherInfo = weatherRepository.getWeatherData(
                    lat = latitude,
                    long = longitude
                )
                emit(Resource.Success(data = weatherInfo))
            } catch (e: Exception) {
                emit(Resource.Error(e.message))
            }
        }
    }
}