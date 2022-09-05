package com.example.weatherapp.util

/**
 * Created by Vazhapp on 05.09.2022
 */
sealed class Resource<T>(val data: T? = null, val errorMessage: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(data: T?) : Resource<T>(data)
    object Loading
}

