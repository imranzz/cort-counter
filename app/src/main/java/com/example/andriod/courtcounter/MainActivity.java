package com.example.andriod.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int countA=0;
    int countB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addThreeforTeamA(View v){
        countA=countA+3;
        displayForTeamA(countA);
    }
    public void addTwoforTeamA(View v){
        countA=countA+2;
        displayForTeamA(countA);
    }
    public void addOneforTeamA(View v){
        countA=countA+1;
        displayForTeamA(countA);
    }
    public void addThreeforTeamB(View v){
        countB=countB+3;
        displayForTeamB(countB);
    }
    public void addTwoforTeamB(View v){
        countB=countB+2;
        displayForTeamB(countB);
    }
    public void addOneforTeamB(View v){
        countB=countB+1;
        displayForTeamB(countB);
    }
    public void resets(View v){
        countA=0;
        countB=0;
        displayForTeamA(countA);
        displayForTeamB(countB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
