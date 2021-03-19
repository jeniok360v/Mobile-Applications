package com.example.additiongame;

public class TimerTime {
    public static int timeByRound(int round){
        return (100/(round+4)+3)*1000;
    }
}
