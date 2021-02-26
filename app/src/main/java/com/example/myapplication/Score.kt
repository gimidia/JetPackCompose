package com.example.myapplication

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class Score(
    homeTeam: String,
    homeScore: Int,
    visitorTeam: String,
    visitorScore: Int
) {
    var homeTeam by mutableStateOf(homeTeam)
    var homeScore by mutableStateOf(homeScore)
    var visitorTeam by mutableStateOf(visitorTeam)
    var visitorScore by mutableStateOf(visitorScore)
}