package com.example.weatherapp.domain.location

import android.location.Location

/**
 * Created by Vazhapp on 05.09.2022
 */
interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}