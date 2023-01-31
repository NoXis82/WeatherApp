package ru.umarsh.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query
import ru.umarsh.weatherapp.domen.dto.weather.WeatherDto

interface WeatherApi {

    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto
}