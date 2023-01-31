package ru.umarsh.weatherapp.domen.location

import android.location.Location

interface LocationTracker {

    suspend fun getCurrentLocation(): Location?
}