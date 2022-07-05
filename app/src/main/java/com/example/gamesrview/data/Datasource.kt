package com.example.gamesrview.data

import com.example.gamesrview.R
import com.example.gamesrview.data.model.Games

class Datasource() {

    fun loadPsGames(): List<Games> {
        return listOf(
            Games(R.drawable.ps_1_png),
            Games(R.drawable.ps_2),
            Games(R.drawable.ps_3),
            Games(R.drawable.ps_4),
            Games(R.drawable.ps_5)
        )
    }

    fun loadSwitchGames(): List<Games> {
        return listOf(
            Games(R.drawable.switch_1),
            Games(R.drawable.switch_2),
            Games(R.drawable.switch_3),
            Games(R.drawable.switch_4),
            Games(R.drawable.switch_5)
        )
    }

    fun loadXboxGames(): List<Games> {
        return listOf(
            Games(R.drawable.xbox_1),
            Games(R.drawable.xbox_2),
            Games(R.drawable.xbox_3),
            Games(R.drawable.xbox_4),
            Games(R.drawable.xbox_5)
        )
    }
}
