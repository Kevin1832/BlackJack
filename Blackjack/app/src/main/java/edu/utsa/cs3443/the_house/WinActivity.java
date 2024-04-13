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
public class WinActivity extends AppCompatActivity {
    /**
     *onCreate method is overridden to initialize the activity
     * by calling the superclass method, and the content view is
     * set to the "activity_win.xml." to display a result screen
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
    }
}
