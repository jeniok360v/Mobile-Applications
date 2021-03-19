package com.example.kotlinadditiongame

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinadditiongame.databinding.ActivityMainBinding
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var playerSum = 0
    var nums = intArrayOf(11, 7, 5, 3, 2, 1)
    var numCount = IntArray(6)
    var randNumber = 0
    var score = 0
    var nextRound = false
    var roundNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.getRoot());
        roll()
    }

    private fun roll() {
        for (i in numCount.indices) {
            score += nums[i] * nums[i] * numCount[i]
            numCount[i] = 0
        }
        playerSum = 0
        val rand = Random()
        randNumber = rand.nextInt(100) + 1
        binding.num1Amount.text = Integer.toString(numCount[0])
        binding.num2Amount.text = Integer.toString(numCount[1])
        binding.num3Amount.text = Integer.toString(numCount[2])
        binding.num4Amount.text = Integer.toString(numCount[3])
        binding.num5Amount.text = Integer.toString(numCount[4])
        binding.num6Amount.text = Integer.toString(numCount[5])
        binding.neededSum.text = "You need this number: " + Integer.toString(randNumber)
        binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
        binding.score.text = "score: " + Integer.toString(score)
        val milisec: Int = (100 / (roundNum + 4) + 3) * 1000
        val mCountDownTimer: CountDownTimer = object : CountDownTimer(milisec.toLong(), 50) {
            var i = 0
            override fun onTick(millisUntilFinished: Long) {
                Log.v("Log_tag", "Tick of Progress$i$millisUntilFinished")
                i++
                binding.progressBar.progress = i * 100 / (milisec / 50)
                if (nextRound) {
                    cancel()
                    nextRound = false
                }
            }

            override fun onFinish() {
                binding.nextNum.isEnabled = false
                binding.progressBar.progress = 100
            }
        }
        mCountDownTimer.start()
        roundNum++
    }

    fun num1_plusB(view: View?) {
        playerSum += 11
        numCount[0]++
        val playerS = findViewById<TextView>(R.id.playersSum)
        playerS.text = "Your sum: " + Integer.toString(playerSum)
        val amount_first = findViewById<TextView>(R.id.num1Amount)
        amount_first.text = Integer.toString(numCount[0])
    }

    fun num2_plusB(view: View?) {
        playerSum += 7
        numCount[1]++
        binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
        binding.num2Amount.text = Integer.toString(numCount[1])
    }

    fun num3_plusB(view: View?) {
        playerSum += 5
        numCount[2]++
        binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
        binding.num3Amount.text = Integer.toString(numCount[2])
    }

    fun num4_plusB(view: View?) {
        playerSum += 3
        numCount[3]++
        binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
        binding.num4Amount.text = Integer.toString(numCount[3])
    }

    fun num5_plusB(view: View?) {
        playerSum += 2
        numCount[4]++
        binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
        binding.num5Amount.text = Integer.toString(numCount[4])
    }

    fun num6_plusB(view: View?) {
        playerSum += 1
        numCount[5]++
        binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
        binding.num6Amount.text = Integer.toString(numCount[5])
    }


    fun num1_minusB(view: View?) {
        if (numCount[0] > 0) {
            playerSum -= 11
            numCount[0]--
            binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
            binding.num1Amount.text = Integer.toString(numCount[0])
        }
    }

    fun num2_minusB(view: View?) {
        if (numCount[1] > 0) {
            playerSum -= 7
            numCount[1]--
            binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
            binding.num2Amount.text = Integer.toString(numCount[1])
        }
    }

    fun num3_minusB(view: View?) {
        if (numCount[2] > 0) {
            playerSum -= 5
            numCount[2]--
            binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
            binding.num3Amount.text = Integer.toString(numCount[2])
        }
    }

    fun num4_minusB(view: View?) {
        if (numCount[3] > 0) {
            playerSum -= 3
            numCount[3]--
            binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
            binding.num4Amount.text = Integer.toString(numCount[3])
        }
    }

    fun num5_minusB(view: View?) {
        if (numCount[4] > 0) {
            playerSum -= 2
            numCount[4]--
            binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
            binding.num5Amount.text = Integer.toString(numCount[4])
        }
    }

    fun num6_minusB(view: View?) {
        if (numCount[5] > 0) {
            playerSum -= 1
            numCount[5]--
            binding.playersSum.text = "Your sum: " + Integer.toString(playerSum)
            binding.num6Amount.text = Integer.toString(numCount[5])
        }
    }

    @Throws(InterruptedException::class)
    fun rollNextNum(view: View?) {
        if (playerSum == randNumber) {
            Toast.makeText(this, "Right!", Toast.LENGTH_SHORT).show()
            nextRound = true
            TimeUnit.MILLISECONDS.sleep(300)
            roll()
        } else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
        }
    }
}