package com.example.tic_tac_toe

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Game_5x5 : AppCompatActivity(), View.OnClickListener {
    var gameCounter = 0 // x-even, o-odd
    val gameField = Array<String>(25){i->""}
    lateinit var endG: EndGame5;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_5x5)
        findViewById<Button>(R.id.button5_1).setOnClickListener(this)
        findViewById<Button>(R.id.button5_2).setOnClickListener(this)
        findViewById<Button>(R.id.button5_3).setOnClickListener(this)
        findViewById<Button>(R.id.button5_4).setOnClickListener(this)
        findViewById<Button>(R.id.button5_5).setOnClickListener(this)
        findViewById<Button>(R.id.button5_6).setOnClickListener(this)
        findViewById<Button>(R.id.button5_7).setOnClickListener(this)
        findViewById<Button>(R.id.button5_8).setOnClickListener(this)
        findViewById<Button>(R.id.button5_9).setOnClickListener(this)
        findViewById<Button>(R.id.button5_10).setOnClickListener(this)
        findViewById<Button>(R.id.button5_11).setOnClickListener(this)
        findViewById<Button>(R.id.button5_12).setOnClickListener(this)
        findViewById<Button>(R.id.button5_13).setOnClickListener(this)
        findViewById<Button>(R.id.button5_14).setOnClickListener(this)
        findViewById<Button>(R.id.button5_15).setOnClickListener(this)
        findViewById<Button>(R.id.button5_16).setOnClickListener(this)
        findViewById<Button>(R.id.button5_17).setOnClickListener(this)
        findViewById<Button>(R.id.button5_18).setOnClickListener(this)
        findViewById<Button>(R.id.button5_19).setOnClickListener(this)
        findViewById<Button>(R.id.button5_20).setOnClickListener(this)
        findViewById<Button>(R.id.button5_21).setOnClickListener(this)
        findViewById<Button>(R.id.button5_22).setOnClickListener(this)
        findViewById<Button>(R.id.button5_23).setOnClickListener(this)
        findViewById<Button>(R.id.button5_24).setOnClickListener(this)
        findViewById<Button>(R.id.button5_25).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val str:String=roll()
        when (v.id) {
            R.id.button5_1 -> {findViewById<Button>(R.id.button5_1).text = str;findViewById<Button>(R.id.button5_1).isEnabled = false;gameField[0]=str}
            R.id.button5_2 -> {findViewById<Button>(R.id.button5_2).text = str;findViewById<Button>(R.id.button5_2).isEnabled = false;gameField[1]=str}
            R.id.button5_3 -> {findViewById<Button>(R.id.button5_3).text = str;findViewById<Button>(R.id.button5_3).isEnabled = false;gameField[2]=str}
            R.id.button5_4 -> {findViewById<Button>(R.id.button5_4).text = str;findViewById<Button>(R.id.button5_4).isEnabled = false;gameField[3]=str}
            R.id.button5_5 -> {findViewById<Button>(R.id.button5_5).text = str;findViewById<Button>(R.id.button5_5).isEnabled = false;gameField[4]=str}
            R.id.button5_6 -> {findViewById<Button>(R.id.button5_6).text = str;findViewById<Button>(R.id.button5_6).isEnabled = false;gameField[5]=str}
            R.id.button5_7 -> {findViewById<Button>(R.id.button5_7).text = str;findViewById<Button>(R.id.button5_7).isEnabled = false;gameField[6]=str}
            R.id.button5_8 -> {findViewById<Button>(R.id.button5_8).text = str;findViewById<Button>(R.id.button5_8).isEnabled = false;gameField[7]=str}
            R.id.button5_9 -> {findViewById<Button>(R.id.button5_9).text = str;findViewById<Button>(R.id.button5_9).isEnabled = false;gameField[8]=str}
            R.id.button5_10 -> {findViewById<Button>(R.id.button5_10).text = str;findViewById<Button>(R.id.button5_10).isEnabled = false;gameField[9]=str}
            R.id.button5_11 -> {findViewById<Button>(R.id.button5_11).text = str;findViewById<Button>(R.id.button5_11).isEnabled = false;gameField[10]=str}
            R.id.button5_12 -> {findViewById<Button>(R.id.button5_12).text = str;findViewById<Button>(R.id.button5_12).isEnabled = false;gameField[11]=str}
            R.id.button5_13 -> {findViewById<Button>(R.id.button5_13).text = str;findViewById<Button>(R.id.button5_13).isEnabled = false;gameField[12]=str}
            R.id.button5_14 -> {findViewById<Button>(R.id.button5_14).text = str;findViewById<Button>(R.id.button5_14).isEnabled = false;gameField[13]=str}
            R.id.button5_15 -> {findViewById<Button>(R.id.button5_15).text = str;findViewById<Button>(R.id.button5_15).isEnabled = false;gameField[14]=str}
            R.id.button5_16 -> {findViewById<Button>(R.id.button5_16).text = str;findViewById<Button>(R.id.button5_16).isEnabled = false;gameField[15]=str}
            R.id.button5_17 -> {findViewById<Button>(R.id.button5_17).text = str;findViewById<Button>(R.id.button5_17).isEnabled = false;gameField[16]=str}
            R.id.button5_18 -> {findViewById<Button>(R.id.button5_18).text = str;findViewById<Button>(R.id.button5_18).isEnabled = false;gameField[17]=str}
            R.id.button5_19 -> {findViewById<Button>(R.id.button5_19).text = str;findViewById<Button>(R.id.button5_19).isEnabled = false;gameField[18]=str}
            R.id.button5_20 -> {findViewById<Button>(R.id.button5_20).text = str;findViewById<Button>(R.id.button5_20).isEnabled = false;gameField[19]=str}
            R.id.button5_21 -> {findViewById<Button>(R.id.button5_21).text = str;findViewById<Button>(R.id.button5_21).isEnabled = false;gameField[20]=str}
            R.id.button5_22 -> {findViewById<Button>(R.id.button5_22).text = str;findViewById<Button>(R.id.button5_22).isEnabled = false;gameField[21]=str}
            R.id.button5_23 -> {findViewById<Button>(R.id.button5_23).text = str;findViewById<Button>(R.id.button5_23).isEnabled = false;gameField[22]=str}
            R.id.button5_24 -> {findViewById<Button>(R.id.button5_24).text = str;findViewById<Button>(R.id.button5_24).isEnabled = false;gameField[23]=str}
            R.id.button5_25 -> {findViewById<Button>(R.id.button5_25).text = str;findViewById<Button>(R.id.button5_25).isEnabled = false;gameField[24]=str}
        }
        endG = checkWin()
        if(endG.winState=="x"|| endG.winState=="o"){
            findViewById<TextView>(R.id.player5BottomView).visibility = View.VISIBLE
            findViewById<TextView>(R.id.player5TopView).visibility = View.VISIBLE
            findViewById<Button>(R.id.returnToMenu5).visibility = View.VISIBLE

            findViewById<Button>(R.id.button5_1).isEnabled = false
            findViewById<Button>(R.id.button5_2).isEnabled = false
            findViewById<Button>(R.id.button5_3).isEnabled = false
            findViewById<Button>(R.id.button5_4).isEnabled = false
            findViewById<Button>(R.id.button5_5).isEnabled = false
            findViewById<Button>(R.id.button5_6).isEnabled = false
            findViewById<Button>(R.id.button5_7).isEnabled = false
            findViewById<Button>(R.id.button5_8).isEnabled = false
            findViewById<Button>(R.id.button5_9).isEnabled = false
            findViewById<Button>(R.id.button5_10).isEnabled = false
            findViewById<Button>(R.id.button5_11).isEnabled = false
            findViewById<Button>(R.id.button5_12).isEnabled = false
            findViewById<Button>(R.id.button5_13).isEnabled = false
            findViewById<Button>(R.id.button5_14).isEnabled = false
            findViewById<Button>(R.id.button5_15).isEnabled = false
            findViewById<Button>(R.id.button5_16).isEnabled = false
            findViewById<Button>(R.id.button5_17).isEnabled = false
            findViewById<Button>(R.id.button5_18).isEnabled = false
            findViewById<Button>(R.id.button5_19).isEnabled = false
            findViewById<Button>(R.id.button5_20).isEnabled = false
            findViewById<Button>(R.id.button5_21).isEnabled = false
            findViewById<Button>(R.id.button5_22).isEnabled = false
            findViewById<Button>(R.id.button5_23).isEnabled = false
            findViewById<Button>(R.id.button5_24).isEnabled = false
            findViewById<Button>(R.id.button5_25).isEnabled = false

            if(endG.intArray.contains(0)){
                findViewById<Button>(R.id.button5_1).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(1)){
                findViewById<Button>(R.id.button5_2).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(2)){
                findViewById<Button>(R.id.button5_3).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(3)){
                findViewById<Button>(R.id.button5_4).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(4)){
                findViewById<Button>(R.id.button5_5).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(5)){
                findViewById<Button>(R.id.button5_6).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(6)){
                findViewById<Button>(R.id.button5_7).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(7)){
                findViewById<Button>(R.id.button5_8).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(8)){
                findViewById<Button>(R.id.button5_9).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(9)){
                findViewById<Button>(R.id.button5_10).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(10)){
                findViewById<Button>(R.id.button5_11).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(11)){
                findViewById<Button>(R.id.button5_12).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(12)){
                findViewById<Button>(R.id.button5_13).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(13)){
                findViewById<Button>(R.id.button5_14).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(14)){
                findViewById<Button>(R.id.button5_15).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(15)){
                findViewById<Button>(R.id.button5_16).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(16)){
                findViewById<Button>(R.id.button5_17).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(17)){
                findViewById<Button>(R.id.button5_18).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(18)){
                findViewById<Button>(R.id.button5_19).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(19)){
                findViewById<Button>(R.id.button5_20).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(20)){
                findViewById<Button>(R.id.button5_21).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(21)){
                findViewById<Button>(R.id.button5_22).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(22)){
                findViewById<Button>(R.id.button5_23).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(23)){
                findViewById<Button>(R.id.button5_24).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(24)){
                findViewById<Button>(R.id.button5_25).setBackgroundColor(0x4FFF0000)
            }

            if(endG.winState=="x"){
                findViewById<TextView>(R.id.player5BottomView).text = "You won!"
                findViewById<TextView>(R.id.player5TopView).text = "You lose!"
            }
            else{
                findViewById<TextView>(R.id.player5BottomView).text = "You lose!"
                findViewById<TextView>(R.id.player5TopView).text = "You won!"
            }
        }
        else if(endG.winState=="d" && gameCounter==25){
            findViewById<Button>(R.id.returnToMenu5).visibility = View.VISIBLE
            findViewById<TextView>(R.id.player5BottomView).visibility = View.VISIBLE
            findViewById<TextView>(R.id.player5TopView).visibility = View.VISIBLE

            findViewById<TextView>(R.id.player5BottomView).text = "Draw!"
            findViewById<TextView>(R.id.player5TopView).text = "Draw!"
        }

    }

    private fun roll(): String {
        if(gameCounter%2 ==0){
            val topP = findViewById<TextView>(R.id.player5TopView)
            val botP = findViewById<TextView>(R.id.player5BottomView)
            topP.visibility = View.VISIBLE
            botP.visibility = View.INVISIBLE
            gameCounter++
            return "x"
        }
        else {
            val topP = findViewById<TextView>(R.id.player5TopView)
            val botP = findViewById<TextView>(R.id.player5BottomView)
            topP.visibility = View.INVISIBLE
            botP.visibility = View.VISIBLE
            gameCounter++
            return "o"
        }
    }

    fun checkWin():EndGame5{
        val colorize = Array<Int>(5){i->-1}
        for(i in 0..4){
            if(gameField[i*5]+gameField[i*5+1]+gameField[i*5+2]+gameField[i*5+3]+gameField[i*5+4]=="xxxxx"){
                colorize[0]=i*5
                colorize[1]=i*5+1
                colorize[2]=i*5+2
                colorize[3]=i*5+3
                colorize[4]=i*5+4
                return EndGame5("x",colorize)
            }
            else if(gameField[i*5]+gameField[i*5+1]+gameField[i*5+2]+gameField[i*5+3]+gameField[i*5+4]=="ooooo"){
                colorize[0]=i*5
                colorize[1]=i*5+1
                colorize[2]=i*5+2
                colorize[3]=i*5+3
                colorize[4]=i*5+4
                return EndGame5("o",colorize)
            }
        }
        for(i in 0..4){
            if(gameField[i]+gameField[5+i]+gameField[10+i]+gameField[15+i]+gameField[20+i]=="xxxxx"){
                colorize[0]=i
                colorize[1]=5+i
                colorize[2]=10+i
                colorize[3]=15+i
                colorize[4]=20+i
                return EndGame5("x",colorize)
            }
            else if(gameField[i]+gameField[5+i]+gameField[10+i]+gameField[15+i]+gameField[20+i]=="ooooo"){
                colorize[0]=i
                colorize[1]=5+i
                colorize[2]=10+i
                colorize[3]=15+i
                colorize[4]=20+i
                return EndGame5("o",colorize)
            }
        }
        if(gameField[0]+gameField[6]+gameField[12]+gameField[18]+gameField[24]=="xxxxx"){
            colorize[0]=0
            colorize[1]=6
            colorize[2]=12
            colorize[3]=18
            colorize[4]=24
            return EndGame5("x",colorize)
        }
        else if(gameField[0]+gameField[6]+gameField[12]+gameField[18]+gameField[24]=="ooooo"){
            colorize[0]=0
            colorize[1]=6
            colorize[2]=12
            colorize[3]=18
            colorize[4]=24
            return EndGame5("o",colorize)
        }
        if(gameField[4]+gameField[8]+gameField[12]+gameField[16]+gameField[20]=="xxxxx"){
            colorize[0]=4
            colorize[1]=8
            colorize[2]=12
            colorize[3]=16
            colorize[4]=20
            return EndGame5("x",colorize)
        }
        else if(gameField[4]+gameField[8]+gameField[12]+gameField[16]+gameField[20]=="ooooo"){
            colorize[0]=4
            colorize[1]=8
            colorize[2]=12
            colorize[3]=16
            colorize[4]=20
            return EndGame5("o",colorize)
        }
        return EndGame5("d",colorize)
    }


    fun returnToMenuButton5(view: View) {
        val stringBack:String?
        if(endG.winState=="x"){
            stringBack = "X won!"
        }
        else if(endG.winState=="o"){
            stringBack = "O won!"
        }
        else{
            stringBack = "Draw!"
        }

        val myIntent= Intent()
        myIntent.putExtra("result5x5", stringBack)
        setResult(Activity.RESULT_OK, myIntent)

        finish()
    }
}