package ru.umarsh.weatherapp.domen.repository

import ru.umarsh.weatherapp.domen.dto.weather.WeatherInfo
import ru.umarsh.weatherapp.domen.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}