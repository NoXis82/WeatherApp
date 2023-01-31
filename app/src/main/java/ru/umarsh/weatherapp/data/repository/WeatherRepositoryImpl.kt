package ru.umarsh.weatherapp.data.repository

import android.app.Application
import android.util.Log
import ru.umarsh.weatherapp.R
import ru.umarsh.weatherapp.data.mappers.toWeatherInfo
import ru.umarsh.weatherapp.data.remote.WeatherApi
import ru.umarsh.weatherapp.domain.dto.weather.WeatherInfo
import ru.umarsh.weatherapp.domain.repository.WeatherRepository
import ru.umarsh.weatherapp.domain.util.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi,
    private val application: Application
) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(lat = lat, long = long).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: application.getString(R.string.msg_error_api))
        }
    }
}