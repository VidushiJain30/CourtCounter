package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int sc=0,s=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void out(View view)
    {
        sc=sc+3;
        displayForTeamA(sc);
    }
    public void in (View view)
    {
        sc=sc+2;
        displayForTeamA(sc);
    }
    public void free(View view)
    {
        sc=sc+1;
        displayForTeamA(sc);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void out1(View view)
    {
        s=s+3;
        displayForTeamB(s);
    }
    public void in1 (View view)
    {
        s=s+2;
        displayForTeamB(s);
    }
    public void free1(View view)
    {
        s=s+1;
        displayForTeamB(s);
    }
    public void displayForTeamB(int score1) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score1));
    }
    int s1=s;
    int sc1=sc;
    public void res (View view) {
        s = 0;
        sc = 0;
        displayForTeamA(sc);
        displayForTeamB(s);
    }
}
