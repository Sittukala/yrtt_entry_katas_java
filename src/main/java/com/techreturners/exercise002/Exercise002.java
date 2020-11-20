package com.techreturners.exercise002;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public int past(int h, int m, int s) {
        // Your code here!
        int hours=h*1000*60*60;
        int mins= m*1000*60;
        int secs=s*1000;
        int millisecs = hours+mins+secs;

        return millisecs;
    }
}