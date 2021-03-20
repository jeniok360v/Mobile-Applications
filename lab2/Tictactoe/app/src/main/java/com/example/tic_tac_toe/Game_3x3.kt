package com.example.tic_tac_toe

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tic_tac_toe.databinding.ActivityGame3x3Binding

abstract class Game_3x3 : AppCompatActivity(), View.OnClickListener  {
    private lateinit var binding3: ActivityGame3x3Binding
    var gameCounter = 0 // x-even, o-odd
    val gameField = Array<String>(9){i->""}
    //abstract var endG: EndGame;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_3x3)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        //findViewById<Button>(R.id.button1).setOnClickListener(this)
    }


    override fun onClick(v: View) {
        val str:String=roll()
        when (v.id) {
            R.id.button1 -> {findViewById<Button>(R.id.button1).text = str;findViewById<Button>(R.id.button1).isEnabled = false;gameField[0]=str}
            R.id.button2 -> {findViewById<Button>(R.id.button2).text = str;findViewById<Button>(R.id.button2).isEnabled = false;gameField[1]=str}
            R.id.button3 -> {findViewById<Button>(R.id.button3).text = str;findViewById<Button>(R.id.button3).isEnabled = false;gameField[2]=str}
            R.id.button4 -> {findViewById<Button>(R.id.button4).text = str;findViewById<Button>(R.id.button4).isEnabled = false;gameField[3]=str}
            R.id.button5 -> {findViewById<Button>(R.id.button5).text = str;findViewById<Button>(R.id.button5).isEnabled = false;gameField[4]=str}
            R.id.button6 -> {findViewById<Button>(R.id.button6).text = str;findViewById<Button>(R.id.button6).isEnabled = false;gameField[5]=str}
            R.id.button7 -> {findViewById<Button>(R.id.button7).text = str;findViewById<Button>(R.id.button7).isEnabled = false;gameField[6]=str}
            R.id.button8 -> {findViewById<Button>(R.id.button8).text = str;findViewById<Button>(R.id.button8).isEnabled = false;gameField[7]=str}
            R.id.button9 -> {findViewById<Button>(R.id.button9).text = str;findViewById<Button>(R.id.button9).isEnabled = false;gameField[8]=str}
        }
        //val winState = checkWin()
        var endG = checkWin()
        //if(winState=="x" || winState=="o"){
        if(endG.winState=="x"|| endG.winState=="o"){
            findViewById<TextView>(R.id.playerBottomView).visibility = View.VISIBLE
            findViewById<TextView>(R.id.playerTopView).visibility = View.VISIBLE
            findViewById<Button>(R.id.returnToMenu).visibility = View.VISIBLE
            //findViewById<TextView>(R.id.lastWinner).text = "x won"

            findViewById<Button>(R.id.button1).isEnabled = false
            findViewById<Button>(R.id.button2).isEnabled = false
            findViewById<Button>(R.id.button3).isEnabled = false
            findViewById<Button>(R.id.button4).isEnabled = false
            findViewById<Button>(R.id.button5).isEnabled = false
            findViewById<Button>(R.id.button6).isEnabled = false
            findViewById<Button>(R.id.button7).isEnabled = false
            findViewById<Button>(R.id.button8).isEnabled = false
            findViewById<Button>(R.id.button9).isEnabled = false

            if(endG.intArray.contains(0)){
                findViewById<Button>(R.id.button1).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(1)){
                findViewById<Button>(R.id.button2).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(2)){
                findViewById<Button>(R.id.button3).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(3)){
                findViewById<Button>(R.id.button4).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(4)){
                findViewById<Button>(R.id.button5).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(5)){
                findViewById<Button>(R.id.button6).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(6)){
                findViewById<Button>(R.id.button7).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(7)){
                findViewById<Button>(R.id.button8).setBackgroundColor(0x4FFF0000)
            }
            if(endG.intArray.contains(8)){
                findViewById<Button>(R.id.button9).setBackgroundColor(0x4FFF0000)
            }

            if(endG.winState=="x"){
                findViewById<TextView>(R.id.playerBottomView).text = "You won!"
                findViewById<TextView>(R.id.playerTopView).text = "You lose!"
            }
            else{
                findViewById<TextView>(R.id.playerBottomView).text = "You lose!"
                findViewById<TextView>(R.id.playerTopView).text = "You won!"
            }
        }
        else if(endG.winState=="d" && gameCounter==9){
            findViewById<Button>(R.id.returnToMenu).visibility = View.VISIBLE
            findViewById<TextView>(R.id.playerBottomView).visibility = View.VISIBLE
            findViewById<TextView>(R.id.playerTopView).visibility = View.VISIBLE

            findViewById<TextView>(R.id.playerBottomView).text = "Draw!"
            findViewById<TextView>(R.id.playerTopView).text = "Draw!"
        }
    }

    fun roll(): String{
        if(gameCounter%2 ==0){
            val topP = findViewById<TextView>(R.id.playerTopView)
            val botP = findViewById<TextView>(R.id.playerBottomView)
            topP.visibility = View.VISIBLE
            botP.visibility = View.INVISIBLE
            gameCounter++
            return "x"
        }
        else {
            val topP = findViewById<TextView>(R.id.playerTopView)
            val botP = findViewById<TextView>(R.id.playerBottomView)
            topP.visibility = View.INVISIBLE
            botP.visibility = View.VISIBLE
            gameCounter++
            return "o"
        }
    }

    fun checkWin():EndGame{
        val colorize = Array<Int>(3){i->-1}
        var ret: EndGame
        for(i in 0..2){
            if(gameField[i*3]+gameField[i*3+1]+gameField[i*3+2]=="xxx"){
                colorize[0]=i*3
                colorize[1]=i*3+1
                colorize[2]=i*3+2

                ret= EndGame("x",colorize)

                return ret
            }
            else if(gameField[i*3]+gameField[i*3+1]+gameField[i*3+2]=="ooo"){
                colorize[0]=i*3
                colorize[1]=i*3+1
                colorize[2]=i*3+2
                ret= EndGame("o",colorize)
                return ret
            }
        }
        for(i in 0..2){
            if(gameField[i]+gameField[i+3]+gameField[i+6]=="xxx"){
                colorize[0]=i
                colorize[1]=i+3
                colorize[2]=i+6
                ret= EndGame("x",colorize)
                return ret
            }
            else if(gameField[i]+gameField[i+3]+gameField[i+6]=="ooo"){
                colorize[0]=i
                colorize[1]=i+3
                colorize[2]=i+6
                ret= EndGame("o",colorize)
                return ret
            }
        }
        if(gameField[0]+gameField[4]+gameField[8]=="xxx"){
            colorize[0]=0
            colorize[1]=4
            colorize[2]=8
            ret= EndGame("x",colorize)
            return ret
        }
        else if(gameField[0]+gameField[4]+gameField[8]=="ooo"){
            colorize[0]=0
            colorize[1]=4
            colorize[2]=8
            ret= EndGame("o",colorize)
            return ret
        }
        if(gameField[2]+gameField[4]+gameField[6]=="xxx"){
            colorize[0]=2
            colorize[1]=4
            colorize[2]=6
            ret= EndGame("x",colorize)
            return ret
        }
        else if(gameField[2]+gameField[4]+gameField[6]=="ooo"){
            colorize[0]=2
            colorize[1]=4
            colorize[2]=6
            ret= EndGame("o",colorize)
            return ret
        }
        ret = EndGame("d",colorize)
        return ret
    }

    fun returnToMenuButton(view: View) {

        val stringBack:String
        //if(endG.winState=="x"){
        if(true){
            findViewById<TextView>(R.id.lastWinner).text = "Result of the last game:\nX won!"
            stringBack = "X won!"
        }
        else if(false){
        //else if(endG.winState=="o"){
            stringBack = "O won!"
        }
        else{
            stringBack = "Draw!"
        }
        //val intent = Intent()
        //intent.putExtra("keyName", stringBack)
        //setResult(Activity.RESULT_OK, intent)
        finish()
    }


}
