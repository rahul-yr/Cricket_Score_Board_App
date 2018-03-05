package com.example.andriod.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int scoreOfTeamA = 0;
    private int scoreOfTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixA(View view) {
        int addOns = 6;
        TextView tv = (TextView) findViewById(R.id.scoreA_id);
        scoreOfTeamA = scoreOfTeamA + addOns;
        tv.setText(String.valueOf(scoreOfTeamA));
    }

    public void fourA(View view) {
        int addOns = 4;
        TextView tv = (TextView) findViewById(R.id.scoreA_id);
        scoreOfTeamA = scoreOfTeamA + addOns;
        tv.setText(String.valueOf(scoreOfTeamA));
    }

    public void oneA(View view) {
        int addOns = 1;
        TextView tv = (TextView) findViewById(R.id.scoreA_id);
        scoreOfTeamA = scoreOfTeamA + addOns;
        tv.setText(String.valueOf(scoreOfTeamA));
    }

    public void outA(View view) {
        int addOns = 0;
        TextView tv = (TextView) findViewById(R.id.scoreA_id);
        scoreOfTeamA = scoreOfTeamA + addOns;
        tv.setText(String.valueOf(scoreOfTeamA));
    }

    // Team B declarations
    public void sixB(View view) {
        int addOns = 6;
        TextView tv = (TextView) findViewById(R.id.scoreB_id);
        scoreOfTeamB = scoreOfTeamB + addOns;
        tv.setText(String.valueOf(scoreOfTeamB));
    }

    public void fourB(View view) {
        int addOns = 4;
        TextView tv = (TextView) findViewById(R.id.scoreB_id);
        scoreOfTeamB = scoreOfTeamB + addOns;
        tv.setText(String.valueOf(scoreOfTeamB));
    }

    public void oneB(View view) {
        int addOns = 1;
        TextView tv = (TextView) findViewById(R.id.scoreB_id);
        scoreOfTeamB = scoreOfTeamB + addOns;
        tv.setText(String.valueOf(scoreOfTeamB));
    }

    public void outB(View view) {
        int addOns = 0;
        TextView tv = (TextView) findViewById(R.id.scoreB_id);
        scoreOfTeamB = scoreOfTeamB + addOns;
        tv.setText(String.valueOf(scoreOfTeamB));
    }

    //   Reset Button
    public void reset(View view) {
        scoreOfTeamA = 0;
        scoreOfTeamB = 0;
        TextView teamA = (TextView) findViewById(R.id.scoreA_id);
        TextView teamB = (TextView) findViewById(R.id.scoreB_id);
        teamA.setText(String.valueOf(scoreOfTeamA));
        teamB.setText(String.valueOf(scoreOfTeamB));
        View v;
        
    }
}
