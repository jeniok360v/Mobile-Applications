package com.example.kotlinadditiongame

import android.os.CountDownTimer
import android.util.Log
import java.util.*

private open fun roll() {
    for (i in numCount.indices) {
        score += nums.get(i) * nums.get(i) * numCount.get(i)
        numCount.get(i) = 0
    }
    playerSum = 0
    val rand = Random()
    randNumber = rand.nextInt(100) + 1
    binding.num1Amount.setText(Integer.toString(numCount.get(0)))
    binding.num2Amount.setText(Integer.toString(numCount.get(1)))
    binding.num3Amount.setText(Integer.toString(numCount.get(2)))
    binding.num4Amount.setText(Integer.toString(numCount.get(3)))
    binding.num5Amount.setText(Integer.toString(numCount.get(4)))
    binding.num6Amount.setText(Integer.toString(numCount.get(5)))
    binding.neededSum.setText("You need this number: " + Integer.toString(randNumber))
    binding.playersSum.setText("Your sum: " + Integer.toString(playerSum))
    binding.score.setText("score: " + Integer.toString(score))
    val milisec: Int = TimerTime.timeByRound(roundNum)
    val mCountDownTimer: CountDownTimer = object : CountDownTimer(milisec.toLong(), 50) {
        var i = 0
        override fun onTick(millisUntilFinished: Long) {
            Log.v("Log_tag", "Tick of Progress$i$millisUntilFinished")
            i++
            binding.progressBar.setProgress(i * 100 / (milisec / 50))
            if (nextRound) {
                cancel()
                nextRound = false
            }
        }

        override fun onFinish() {
            binding.nextNum.setEnabled(false)
            binding.progressBar.setProgress(100)
        }
    }
    mCountDownTimer.start()
    roundNum++
}