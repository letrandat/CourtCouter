package com.daynhauhoc.courtcouter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void addTeamAThreePoints(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTeamATwoPoints(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addTeamAOnePoints(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given scoreTeamB for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void addTeamBThreePoints(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTeamBTwoPoints(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addTeamBOnePoints(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetMatch(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
