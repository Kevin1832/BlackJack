package edu.utsa.cs3443.the_house;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;


/**
 * Team Members:
 * Bryan Hernandez(eqr755)
 *
 * Daisy Montelongo(ivo654)
 *
 * Kevin Grell(fir006)
 */

/*
File Description: For this section We've prepared the primary mechanics of the BlackJack Simulator
At the start of this activity we generate a random selection of cards for both the Dealer and the user/player.
In order to control the flow of interactions between both sides we control the game through a series of button presses
The "Hit", "Stand",
 "House Busted", "Player Busted"
 */
public class TableActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView Draw1,Draw2,Draw3,Draw4, Draw5, Draw7,Draw6;
    private ImageView imageView, imageView5, imageView6, imageView7, imageView8;
    private int[] imageResources = new int[52];
    private int buttonPressCount = 0;
    private int buttonPressCount2 = 0;


    /**
     *
     This Android code, within the onCreate
     method of an activity, sets the content
     view to the "activity_table" layout and
     initializes various buttons and image views.
     It also creates an array of drawable resources
     representing playing cards (clubs, hearts, and spades)
     to be used in the application.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        imageView = findViewById(R.id.CardDraw5);

        Button LoseButton = findViewById(R.id.LoseButton);
        Button WinButton = findViewById(R.id.WinButton);
        LoseButton.setOnClickListener(this);
        WinButton.setOnClickListener(this);

        //----------------------------------

        Draw1 = findViewById(R.id.CardDraw1);
        Draw2 = findViewById(R.id.CardDraw2);
        Draw3 = findViewById(R.id.CardDraw3);
        Draw4 = findViewById(R.id.CardDraw4);
        Draw5 = findViewById(R.id.CardDraw5);
        Draw6 = findViewById(R.id.CardDraw6);
        Draw7 = findViewById(R.id.CardDraw7);

        imageView5 = findViewById(R.id.imageView5); // Local variable for imageView5
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);


        int[] images = {R.drawable.twoofclubs,
                R.drawable.threeofclubs,
                R.drawable.fourofclubs,
                R.drawable.fiveofclubs,
                R.drawable.sixofclubs,
                R.drawable.sevenofclubs,
                R.drawable.eightofclubs,
                R.drawable.nineofclubs,
                R.drawable.tenofclubs,

                R.drawable.kingofclubs,
                R.drawable.queenofclubs,

                R.drawable.jackofclubs,

                R.drawable.aceofclubs,
                R.drawable.twoofhearts,
                R.drawable.threeofhearts,
                R.drawable.fourofhearts,
                R.drawable.fiveofhearts,
                R.drawable.sixofhearts,
                R.drawable.sevenofhearts,
                R.drawable.eightofhearts,
                R.drawable.nineofhearts,
                R.drawable.tenofhearts,

                R.drawable.kingofhearts,
                R.drawable.queenofhearts,

                R.drawable.jackofhearts,

                R.drawable.aceofhearts,


                R.drawable.twoofspades,
                R.drawable.threeofspades,
                R.drawable.fourofspades,
                R.drawable.fiveofspades,
                R.drawable.sixofspades,
                R.drawable.sevenofspades,
                R.drawable.eightofspades,
                R.drawable.nineofspades,
                R.drawable.tenofspades,

                R.drawable.kingofspades,
                R.drawable.queenofspades,

                R.drawable.jackofspades,

                R.drawable.aceofspades,


                R.drawable.twoofspades,
                R.drawable.threeofspades,
                R.drawable.fourofspades,
                R.drawable.fiveofspades,
                R.drawable.sixofspades,
                R.drawable.sevenofspades,
                R.drawable.eightofspades,
                R.drawable.nineofspades,
                R.drawable.tenofspades,

                R.drawable.kingofspades,
                R.drawable.queenofspades,

                R.drawable.jackofspades,

                R.drawable.aceofspades
    };

        for(int i = 0 ; i < 52 ; ++i)
        {
            imageResources[i] = images[i];
        }

        //______________________________________________________________________________________

        //Random random = new Random();
        int randomIndex = new Random().nextInt(imageResources.length);

        imageView.setImageResource(imageResources[randomIndex]);


        int randomIndex1 = new Random().nextInt(imageResources.length);
        int randomIndex2 = new Random().nextInt(imageResources.length);
        int randomIndex3 = new Random().nextInt(imageResources.length);
        int randomIndex4 = new Random().nextInt(imageResources.length);
        int randomIndex5 = new Random().nextInt(imageResources.length);
        int randomIndex6 = new Random().nextInt(imageResources.length);
        int randomIndex7 = new Random().nextInt(imageResources.length);

        Draw1.setImageResource(imageResources[randomIndex1]);
        Draw2.setImageResource(imageResources[randomIndex2]);
        Draw3.setImageResource(imageResources[randomIndex3]);
        Draw4.setImageResource(imageResources[randomIndex4]);
        Draw5.setImageResource(imageResources[randomIndex5]);
        Draw6.setImageResource(imageResources[randomIndex6]);

        Draw7.setImageResource(imageResources[randomIndex7]);


        findViewById(R.id.button19).setOnClickListener(this);
        findViewById(R.id.button20).setOnClickListener(this);

    }

    /**
     *
     * @param view
     */
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button19:
                //----------------------------------------------------------------------------------
                Toast.makeText(this, "Drawing card...", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Random ran = new Random();

                        if (buttonPressCount == 0) {
                            imageView5.setAlpha(0.0f);
                        } else if (buttonPressCount == 1) {
                            imageView6.setAlpha(0.0f);
                        }

                        buttonPressCount++;
                    }
                }, 1500); // 2000 milliseconds (1.5 seconds)
                break;
            //----------------------------------------------------------------------------------

            case R.id.button20:
                Toast.makeText(this, "Standing...", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Dealer's Turn", Toast.LENGTH_SHORT).show();


                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Random ran = new Random();

                        if (buttonPressCount2 == 0) {
                            imageView7.setAlpha(0.0f);
                        } else if (buttonPressCount2 == 1) {
                            imageView8.setAlpha(0.0f);
                        }

                        buttonPressCount2++;
                    }
                }, 1500); // 2
                break;


            case R.id.WinButton:
                Intent intent = new Intent(this, WinActivity.class);
                startActivity(intent);
                break;

            case R.id.LoseButton:
                Intent intent2 = new Intent(this, LoseActivity.class);
                startActivity(intent2);
                break;
        }
    }


}