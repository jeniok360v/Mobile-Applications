package com.example.additiongame;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.additiongame.databinding.ActivityMainBinding;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    int playerSum = 0;
    int[] nums = new int[]{11, 7, 5, 3, 2, 1};
    int[] numCount = new int[6];
    int randNumber;
    int score = 0;
    boolean nextRound = false;
    int roundNum=  0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(binding.getRoot());
        roll();
    }

    private void roll(){

        for(int i=0;i<numCount.length;i++){
            score+=nums[i]*nums[i]*numCount[i];
            numCount[i]=0;
        }
        playerSum=0;
        Random rand =new Random();
        randNumber = rand.nextInt(100)+1;

        binding.num1Amount.setText(Integer.toString(numCount[0]));
        binding.num2Amount.setText(Integer.toString(numCount[1]));
        binding.num3Amount.setText(Integer.toString(numCount[2]));
        binding.num4Amount.setText(Integer.toString(numCount[3]));
        binding.num5Amount.setText(Integer.toString(numCount[4]));
        binding.num6Amount.setText(Integer.toString(numCount[5]));

        binding.neededSum.setText("You need this number: " + Integer.toString(randNumber));
        binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
        binding.score.setText("score: "+ Integer.toString(score));

        int milisec = TimerTime.timeByRound(roundNum);
        CountDownTimer mCountDownTimer=new CountDownTimer(milisec,50) {
            int i = 0;

            @Override
            public void onTick(long millisUntilFinished) {
                Log.v("Log_tag", "Tick of Progress"+ i+ millisUntilFinished);
                i++;
                binding.progressBar.setProgress((int)i*100/(milisec/50));

                if(nextRound){
                    this.cancel();
                    nextRound=false;
                }
            }

            @Override
            public void onFinish() {
                binding.nextNum.setEnabled(false);
                binding.progressBar.setProgress(100);
            }


        };
        mCountDownTimer.start();
        roundNum++;
    }

    public void num1_plusB(View view) {
        playerSum+=11;
        numCount[0]++;
        TextView playerS = findViewById(R.id.playersSum);
        playerS.setText("Your sum: " + Integer.toString(playerSum));
        TextView amount_first = findViewById(R.id.num1Amount);
        amount_first.setText(Integer.toString(numCount[0]));
    }

    public void num2_plusB(View view) {
        playerSum+=7;
        numCount[1]++;
        binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
        binding.num2Amount.setText(Integer.toString(numCount[1]));
    }

    public void num3_plusB(View view) {
        playerSum+=5;
        numCount[2]++;
        binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
        binding.num3Amount.setText(Integer.toString(numCount[2]));
    }

    public void num4_plusB(View view) {
        playerSum+=3;
        numCount[3]++;
        binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
        binding.num4Amount.setText(Integer.toString(numCount[3]));
    }

    public void num5_plusB(View view) {
        playerSum+=2;
        numCount[4]++;
        binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
        binding.num5Amount.setText(Integer.toString(numCount[4]));
    }

    public void num6_plusB(View view) {
        playerSum+=1;
        numCount[5]++;
        binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
        binding.num6Amount.setText(Integer.toString(numCount[5]));
    }


    public void num1_minusB(View view) {
        if(numCount[0]>0){
            playerSum-=11;
            numCount[0]--;
            binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
            binding.num1Amount.setText(Integer.toString(numCount[0]));
        }
    }

    public void num2_minusB(View view) {
        if(numCount[1]>0){
            playerSum-=7;
            numCount[1]--;
            binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
            binding.num2Amount.setText(Integer.toString(numCount[1]));
        }
    }

    public void num3_minusB(View view) {
        if(numCount[2]>0){
            playerSum-=5;
            numCount[2]--;
            binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
            binding.num3Amount.setText(Integer.toString(numCount[2]));
        }
    }

    public void num4_minusB(View view) {
        if(numCount[3]>0){
            playerSum-=3;
            numCount[3]--;
            binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
            binding.num4Amount.setText(Integer.toString(numCount[3]));
        }
    }

    public void num5_minusB(View view) {
        if(numCount[4]>0){
            playerSum-=2;
            numCount[4]--;
            binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
            binding.num5Amount.setText(Integer.toString(numCount[4]));
        }
    }
    
    public void num6_minusB(View view) {
        if(numCount[5]>0){
            playerSum-=1;
            numCount[5]--;
            binding.playersSum.setText("Your sum: " + Integer.toString(playerSum));
            binding.num6Amount.setText(Integer.toString(numCount[5]));
        }
    }

    public void rollNextNum(View view) throws InterruptedException {
        if(playerSum==randNumber){
            Toast.makeText(this, "Right!", Toast.LENGTH_SHORT).show();
            nextRound=true;
            TimeUnit.MILLISECONDS.sleep(300);
            roll();
        }
        else{
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }
    }
}