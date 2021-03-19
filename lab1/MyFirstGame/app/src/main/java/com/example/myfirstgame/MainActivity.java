package com.example.myfirstgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int score;
    private int r1;
    private int r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score=0;
        roll();
    }

    private void roll(){
        TextView points = (TextView)findViewById(R.id.points);
        points.setText("Points: " + Integer.toString(score));
        Random rand = new Random();
        r1 = rand.nextInt(102)-2;
        r2 = rand.nextInt(102)-2;
        Button leftButton = (Button)findViewById(R.id.buttonLeft);
        leftButton.setText(Integer.toString(r1));
        Button rightButton = (Button)findViewById(R.id.buttonRight);
        rightButton.setText(Integer.toString(r2));

    }

    public void leftButton(View view) {
        if(r1>=r2){
            Toast.makeText(this, "Good!", Toast.LENGTH_SHORT).show();
            score++;
        }
        else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
            score--;
        }
        roll();
    }

    public void rightButton(View view) {
        if(r2>=r1){
            Toast.makeText(this, "Good!", Toast.LENGTH_SHORT).show();
            score++;
        }
        else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
            score--;
        }
        roll();
    }
}