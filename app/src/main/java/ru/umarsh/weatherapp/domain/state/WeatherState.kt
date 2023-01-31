package ru.umarsh.weatherapp.domain.state

import ru.umarsh.weatherapp.domain.dto.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
