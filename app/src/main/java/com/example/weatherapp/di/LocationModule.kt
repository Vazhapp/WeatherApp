package com.example.weatherapp.di

import com.example.weatherapp.data.location.LocationTrackerImpl
import com.example.weatherapp.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by Vazhapp on 05.09.2022
 */
@Module
abstract class LocationModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(
        locationTrackerImpl: LocationTrackerImpl
    ): LocationTracker
}