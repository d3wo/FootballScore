package com.example.android.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView txtViewTeamA, txtViewTeamB;
    int scoreA, scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewTeamA = (TextView) findViewById(R.id.txtViewTeamA);
        txtViewTeamB = (TextView) findViewById(R.id.txtViewTeamB);

        scoreA = 0;
        scoreB = 0;

        txtViewTeamA.setText(String.valueOf(scoreA));
        txtViewTeamB.setText(String.valueOf(scoreB));

    }


    public void teamAPlusOne(View view){
        addScoreA(1);

    }

    public void teamAPlusTwo(View view){
        addScoreA(2);

    }

    public void teamAPlusThree(View view){
        addScoreA(3);

    }

    public void teamAPlusSix(View view){
        addScoreA(6);

    }

    public void teamAMinusOne(View view){
        addScoreA(-1);

    }




    public void teamBPlusOne(View view){
        addScoreB(1);

    }


    public void teamBPlusTwo(View view){
        addScoreB(2);

    }

    public void teamBPlusThree(View view){
        addScoreB(3);

    }

    public void teamBPlusSix(View view){
        addScoreB(6);

    }

    public void teamBMinusOne(View view){
        addScoreB(-1);

    }


    private void addScoreA(int incrementNumber){

        scoreA = scoreA + incrementNumber;
        if (scoreA <=0){
            txtViewTeamA.setText(String.valueOf(0));
        }
        else{
            txtViewTeamA.setText(String.valueOf(scoreA));

        }


    }




    private void addScoreB(int incrementNumber) {
        scoreB = scoreB + incrementNumber;
        if (scoreB <=0){
            txtViewTeamB.setText(String.valueOf(0));
        }
        else{
            txtViewTeamB.setText(String.valueOf(scoreB));

        }
    }

    public void resetScore(View view){
        scoreA = 0;
        scoreB = 0;
        txtViewTeamA.setText(String.valueOf(scoreA));
        txtViewTeamB.setText(String.valueOf(scoreB));
    }

}
