package edu.utsa.cs3443.the_house;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Team Members:
 * Bryan Hernandez(eqr755)
 *
 * Daisy Montelongo(ivo654)
 *
 * Kevin Grell(fir006)
 */

/*
Description: This class represents the user interaction for the first menu
 */

public class IntroActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     *
     In the onCreate method, the activity layout is set, and a button with the ID
     "button" is assigned a click listener using setOnClickListener(this).
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    /**
     *
     The onClick method handles button clicks, and if the clicked
     button has the ID "button," it creates an intent to start the
     MenuActivity and initiates the activity transition.
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.button:
                Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }

    }
}