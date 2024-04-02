package edu.utsa.cs3443.the_house.model;
/**
 * Team Members:
 * Bryan Hernandez(eqr755)
 *
 * Daisy Montelongo(ivo654)
 *
 * Kevin Grell(fir006)
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.utsa.cs3443.the_house.MenuActivity;
import edu.utsa.cs3443.the_house.R;
/*
File Description: This Class represents the basic rules displayed on the Rule page of the app
and features a return or "go back" button for the user to return to the last page.
 */

public class RuleActivity extends AppCompatActivity implements View.OnClickListener{
    /**
     *activity's content view is set to the "activity_rules" layout,
     * and a button with ID "button3" is initialized, with the current
     * activity set as a listener for the button's click events.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    /**
     *
     * checks if the clicked view has the ID "button3" and, if true,
     * creates and starts an intent to switch to the "MenuActivity"
     *
     * @param view
     */
    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button3:
                Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
                break;
        }
    }
}