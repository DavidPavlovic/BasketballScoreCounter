package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA;
    private int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the score A on the screen
     */
    public void showScoreA(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.scoreA_text_view);
        scoreTextView.setText("" + number);
    }

    /**
     * This method displays the given score B on the screen
     */
    public void showScoreB(int number){
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB_text_view);
        scoreBTextView.setText("" + number);
    }

    /**
     * Here starts methods for TEAM A
     */
    public void addTwoPoints(View view) {
        scoreA+=2;
        showScoreA(scoreA);
    }

    public void addThreePoints(View view) {
        scoreA+=3;
        showScoreA(scoreA);
    }

    public void addFreePoint(View view) {
        scoreA+=1;
        showScoreA(scoreA);
    }

    /**
     * Here starts methods for TEAM B
     */
    public void addTwoPointsB(View view) {
        scoreB+=2;
        showScoreB(scoreB);
    }

    public void addThreePointsB(View view) {
        scoreB+=3;
        showScoreB(scoreB);
    }

    public void addFreePointB(View view) {
        scoreB+=1;
        showScoreB(scoreB);
    }

    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        showScoreA(scoreA);
        showScoreB(scoreB);
    }
}
