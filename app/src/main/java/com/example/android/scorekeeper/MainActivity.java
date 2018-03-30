package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Each variable is declared and initialized per declaration line
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int yellowTeamA = 0;
    int redTeamA = 0;
    int cornerTeamA = 0;
    int foulTeamB = 0;
    int yellowTeamB = 0;
    int redTeamB = 0;
    int cornerTeamB = 0;
    int offsideTeamA = 0;
    int offsideTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View v) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void foulForTeamA(View v) {

        foulTeamA = foulTeamA + 1;
        foulDisplayForTeamA(foulTeamA);
    }

    public void yellowForTeamA(View v) {

        yellowTeamA = yellowTeamA + 1;
        yellowDisplayForTeamA(yellowTeamA);
    }

    public void redForTeamA(View v) {

        redTeamA = redTeamA + 1;
        redDisplayForTeamA(redTeamA);
    }

    public void offsideForTeamA(View v) {

        offsideTeamA = offsideTeamA + 1;
        offsideDisplayForTeamA(offsideTeamA);
    }

    public void cornerForTeamA(View v) {

        cornerTeamA = cornerTeamA + 1;
        cornerDisplayForTeamA(cornerTeamA);
    }

    public void addOneForTeamB(View v) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void foulForTeamB(View v) {

        foulTeamB = foulTeamB + 1;
        foulDisplayForTeamB(foulTeamB);
    }

    public void yellowForTeamB(View v) {

        yellowTeamB = yellowTeamB + 1;
        yellowDisplayForTeamB(yellowTeamB);
    }

    public void redForTeamB(View v) {

        redTeamB = redTeamB + 1;
        redDisplayForTeamB(redTeamB);
    }

    public void offsideForTeamB(View v) {

        offsideTeamB = offsideTeamB + 1;
        offsideDisplayForTeamB(offsideTeamB);
    }

    public void cornerForTeamB(View v) {

        cornerTeamB = cornerTeamB + 1;
        cornerDisplayForTeamB(cornerTeamB);
    }

    /**
     * Resets all the datas for both teams.
     */
    public void resetScore(View v) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        offsideTeamA = 0;
        offsideTeamB = 0;
        cornerTeamA = 0;
        cornerTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        foulDisplayForTeamA(foulTeamA);
        foulDisplayForTeamB(foulTeamB);
        yellowDisplayForTeamA(yellowTeamA);
        yellowDisplayForTeamB(yellowTeamB);
        redDisplayForTeamA(redTeamA);
        redDisplayForTeamB(redTeamB);
        offsideDisplayForTeamA(foulTeamA);
        offsideDisplayForTeamB(foulTeamB);
        cornerDisplayForTeamA(cornerTeamA);
        cornerDisplayForTeamB(cornerTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void foulDisplayForTeamA(int foul) {
        TextView scoreView = findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void foulDisplayForTeamB(int foul) {
        TextView scoreView = findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the number of yellow cards for Team A.
     */
    public void yellowDisplayForTeamA(int yellow) {
        TextView scoreView = findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the number of yellow cards for Team B.
     */
    public void yellowDisplayForTeamB(int yellow) {
        TextView scoreView = findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the number of red cards for Team A.
     */
    public void redDisplayForTeamA(int red) {
        TextView scoreView = findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(red));
    }

    /**
     * Displays the number of red cards for Team B.
     */
    public void redDisplayForTeamB(int red) {
        TextView scoreView = findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(red));
    }

    /**
     * Displays the number of offsides for Team A.
     */
    public void offsideDisplayForTeamA(int off) {
        TextView scoreView = findViewById(R.id.team_a_offside);
        scoreView.setText(String.valueOf(off));
    }

    /**
     * Displays the number of offsides for Team B.
     */
    public void offsideDisplayForTeamB(int off) {
        TextView scoreView = findViewById(R.id.team_b_offside);
        scoreView.setText(String.valueOf(off));
    }

    /**
     * Displays the number of offsides for Team A.
     */
    public void cornerDisplayForTeamA(int corner) {
        TextView scoreView = findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(corner));
    }

    /**
     * Displays the number of offsides for Team B.
     */
    public void cornerDisplayForTeamB(int corner) {
        TextView scoreView = findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(corner));
    }
}