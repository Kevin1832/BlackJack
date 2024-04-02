package edu.utsa.cs3443.the_house;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.utsa.cs3443.the_house.model.RuleActivity;


/**
 * Team Members:
 * Bryan Hernandez(eqr755)
 *
 * Daisy Montelongo(ivo654)
 *
 * Kevin Grell(fir006)
 */

/*
File Description: This class instills 2 buttons, The "Play a hand" button continues to take the user to a table to play a game of blackjack and
the "Settings" button Takes the user to a page where they can visually update the Table through changing the table colors and the card backs.
 */
public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * within the onCreate method of an activity, sets
     * the content view to the "activity_menu" layout
     * and initializes two buttons with IDs "button1"
     * and "button2," attaching the current activity as a
     * listener for both buttons.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

//______________________________________________________________________________________

    /**
     * represents the onClick method for button clicks in the associated activity. It uses
     * a switch statement to handle different button clicks, launching corresponding
     * activities (SettingsActivity or TableActivity) based on the clicked button's ID.
     * @param view
     */
    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button2:
                Intent intent1 = new Intent(this, RuleActivity.class);
                startActivity(intent1);

                break;
            case R.id.button1:
                Intent intent2 = new Intent(this, TableActivity.class);
                startActivity(intent2);

                break;


            default:
                break;
        }
    }}
