package ru.umarsh.weatherapp.domain.dto.weather

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
