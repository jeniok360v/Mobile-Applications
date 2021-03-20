package com.example.tic_tac_toe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start3x3game(view: View) {
        val intent3x3 = Intent(this, Game_3x3::class.java)
        startActivity(intent3x3)
    }
    fun start5x5game(view: View) {
        val intent5x5 = Intent(this, Game_5x5::class.java)
        startActivity(intent5x5)}
}