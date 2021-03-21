package com.example.tic_tac_toe


import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start3x3game(view: View) {
        val intent3x3 = Intent(this, Game_3x3::class.java)
        startActivityForResult(intent3x3, 3)
    }
    fun start5x5game(view: View) {
        val intent5x5 = Intent(this, Game_5x5::class.java)
        startActivityForResult(intent5x5, 5)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 3) {
            if (resultCode == Activity.RESULT_OK) {
                val returnString = data!!.getStringExtra("result3x3")
                val textView = findViewById(R.id.lastWinner) as TextView
                textView.text = "Result of the last game:\n" + returnString
            }
        }
        if (requestCode == 5) {
            if (resultCode == Activity.RESULT_OK) {
                val returnString = data!!.getStringExtra("result5x5")
                val textView = findViewById(R.id.lastWinner) as TextView
                textView.text = "Result of the last game:\n" + returnString
            }
        }
    }





}