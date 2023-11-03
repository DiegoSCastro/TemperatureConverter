package com.diegocastro.temperature_converter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.roundToInt

class MainViewModel : ViewModel() {
    var tempC by mutableStateOf(0)
    
    fun convertTemperature(tempF: String) {
        tempC = ((tempF.toInt() - 32) * 0.5556).roundToInt()
    }
}