package edu.utsa.cs3443.the_house;

import android.os.Bundle;
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
File Description: This class hold one of our results screen for when the player recognizes they have busted and switch screen to this display
 */

public class LoseActivity extends AppCompatActivity {

    /**
     *defines the onCreate method for an activity, initializing
     * its UI layout using the "activity_lost" layout resource.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);


    }
}
