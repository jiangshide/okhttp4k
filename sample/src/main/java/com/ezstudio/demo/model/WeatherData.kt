package com.ezstudio.demo.model

import com.ezstudio.demo.model.Coord

/**
 * Created by enzowei on 2017/12/6.
 */
data class WeatherData(var cod: Int = 0,
                       var name: String,
                       var id: Long = 0,
                       var coord: Coord)