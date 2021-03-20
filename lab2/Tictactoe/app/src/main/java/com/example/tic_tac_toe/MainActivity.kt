package com.example.tic_tac_toe


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    //private val SECOND_ACTIVITY_REQUEST_CODE = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start3x3game(view: View) {
        val intent3x3 = Intent(this, Game_3x3::class.java)
        startActivity(intent3x3)
        //startActivityForResult(intent3x3, SECOND_ACTIVITY_REQUEST_CODE)
    }/*
    fun start5x5game(view: View) {
        val intent5x5 = Intent(this, Game_5x5::class.java)
        startActivityForResult(intent5x5, SECOND_ACTIVITY_REQUEST_CODE)
    }
    */
/*
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Check that it is the SecondActivity with an OK result
        if (requestCode == SECOND_ACTIVITY_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {

                // Get String data from Intent
                val returnString = data!!.getStringExtra("keyName")

                // Set text view with string
                val textView = findViewById(R.id.lastWinner) as TextView
                textView.text = "Result of the last game:\n" + returnString
            }
        }
    }

 */



}