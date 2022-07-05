package com.example.gamesrview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.gamesrview.adapter.ItemAdapter
import com.example.gamesrview.data.Datasource
import com.example.gamesrview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val psGames = Datasource().loadPsGames()
        val switchGames = Datasource().loadSwitchGames()
        val xboxGames = Datasource().loadXboxGames()

        binding.rvPs.adapter = ItemAdapter(this, psGames)
        binding.rvSwitch.adapter = ItemAdapter(this, switchGames)
        binding.rvXbox.adapter = ItemAdapter(this, xboxGames)

        binding.rvPs.setHasFixedSize(true)
        binding.rvSwitch.setHasFixedSize(true)
        binding.rvXbox.setHasFixedSize(true)
    }
}
