package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView2);
        scoreView.setText(String.valueOf(score));
    }
    public void addTouchDownTeamA(View view){
        scoreTeamA +=6;
        displayForTeamA(scoreTeamA);
    }
    public void addFieldGoalTeamA(View view){
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPointConversionTeamA(View view){
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }
    public void addSafetyTeamA(View view){
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }
    public void add1PointTeamA(View view){
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB);
        scoreView.setText(String.valueOf(score));
    }
    public void addTouchDownTeamB(View view){
        scoreTeamB +=6;
        displayForTeamB(scoreTeamB);
    }
    public void addFieldGoalTeamB(View view){
        scoreTeamB +=3;
        displayForTeamB(scoreTeamB);
    }
    public void twoPointConversionTeamB(View view){
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }
    public void addSafetyTeamB(View view){
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }
    public void add1PointTeamB(View view){
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }
    public void resetButton (View view){
        scoreTeamA = 0;
        scoreTeamB= 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
