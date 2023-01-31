package ru.umarsh.weatherapp.domain.repository

import ru.umarsh.weatherapp.domain.dto.weather.WeatherInfo
import ru.umarsh.weatherapp.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}