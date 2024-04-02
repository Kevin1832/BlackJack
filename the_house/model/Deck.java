package edu.utsa.cs3443.the_house.model;
/**
 * Team Members:
 * Bryan Hernandez(eqr755)
 *
 * Daisy Montelongo(ivo654)
 *
 * Kevin Grell(fir006)
 */
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
/*
File Description: This class holds the entire deck of cards that will be randomly generated and pulled
from during the interaction between the dealer and the player
 */

public class Deck extends AppCompatActivity {
    private String cardName;
    private int cardValue, cardNum;
    private ImageView imageView;


    /**
     *
     *
     The constructor Deck initializes the attributes
     cardNum, cardName, and cardValue of an instance
     of the Deck class with the provided parameters.
     *
     * @param cardName
     * @param cardValue
     * @param cardNum
     */
    public Deck(String cardName, int cardValue, int cardNum) {
        this.cardNum = cardNum;
        this.cardName = cardName;
        this.cardValue = cardValue;
    }

    /**
     * getter forCardName
     * @return
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * getter for CardValue
     * @return
     */
    public int getCardValue() {
        return cardValue;
    }

    /**
     * getter for CardNum
     * @return
     */
    public int getCardNum(){
        return cardNum;
    }


    public class InDeck {
        ArrayList<Deck> cards = new ArrayList<Deck>();


        public InDeck() {
            // Add cards to the ArrayList within the constructor
            cards.add(new Deck("Hearts",2 ,1));//second
            cards.add(new Deck("Hearts",3 ,2));//third
            cards.add(new Deck("Hearts",4 ,3));//fourth
            cards.add(new Deck("Hearts",5 ,4));//fifth
            cards.add(new Deck("Hearts",6 ,5));//sixth
            cards.add(new Deck("Hearts",7 ,6));//seventh
            cards.add(new Deck("Hearts",8 ,7));//eight
            cards.add(new Deck("Hearts",9 ,8));//ninth
            cards.add(new Deck("Hearts",10 ,9));//tenth
            cards.add(new Deck("King of Hearts",10 ,10));
            cards.add(new Deck("Queen of Hearts",10 ,11));
            cards.add(new Deck("ACE of Hearts",1 & 11,12));
            cards.add(new Deck("Jack of Hearts",10 ,13));

            cards.add(new Deck("Spades",2 ,14));//second
            cards.add(new Deck("Spades",3 ,15));//third
            cards.add(new Deck("Spades",4 ,16));//fourth
            cards.add(new Deck("Spades",5 ,17));//fifth
            cards.add(new Deck("Spades",6 ,18));//sixth
            cards.add(new Deck("Spades",7 ,19));//seventh
            cards.add(new Deck("Spades",8 ,20));//eighth
            cards.add(new Deck("Spades",9 ,21));//ninth
            cards.add(new Deck("Spades",10 ,22));//tenth
            cards.add(new Deck("King of Spades",10 ,23));
            cards.add(new Deck("Queen of Spades",10 ,24));
            cards.add(new Deck("ACE of Spades",1 & 11,25));
            cards.add(new Deck("Jack of Spades",10 ,26));



            cards.add(new Deck("Diamonds",2 ,27));//second
            cards.add(new Deck("Diamonds",3 ,28));//third
            cards.add(new Deck("Diamonds",4 ,29));//fourth
            cards.add(new Deck("Diamonds",5 ,30));//fifth
            cards.add(new Deck("Diamonds",6 ,31));//sixth
            cards.add(new Deck("Diamonds",7 ,32));//seventh
            cards.add(new Deck("Diamonds",8 ,33));//eighth
            cards.add(new Deck("Diamonds",9 ,34));//ninth
            cards.add(new Deck("Diamonds",10 ,35));//tenth
            cards.add(new Deck("King of Diamonds",10 ,36));
            cards.add(new Deck("Queen of Diamonds",10 ,37));
            cards.add(new Deck("ACE of Diamonds",1 & 11,38));
            cards.add(new Deck("Jack of Diamonds",10 ,39));

            cards.add(new Deck("Clubs",2 ,40));
            cards.add(new Deck("Clubs",3 ,41));
            cards.add(new Deck("Clubs",4 ,42));
            cards.add(new Deck("Clubs",5 ,43));
            cards.add(new Deck("Clubs",6 ,44));
            cards.add(new Deck("Clubs",7 ,45));
            cards.add(new Deck("Clubs",8 ,46));
            cards.add(new Deck("Clubs",9 ,47));
            cards.add(new Deck("Clubs",10 ,48));
            cards.add(new Deck("King of Clubs",10 ,49));
            cards.add(new Deck("Queen of Clubs",10 ,50));
            cards.add(new Deck("ACE of Clubs",1 & 11,51));
            cards.add(new Deck("Jack of Clubs",10 ,52));

        }


        public void printDeck() {
            for (Deck card : cards) {
                String cardName = card.getCardName();
                int cardValue = card.getCardValue();
                int cardNum = card.getCardNum();

                System.out.println(cardValue + " of " + cardName);
            }
        }
    }

    /**
     *
     The main method creates a deck instance with parameters,
     instantiates an inner class InDeck representing a deck of
     cards, and prints information about each card in the deck.
     * @param args
     */
    public static void main(String[] args) {
        Deck deck = new Deck("Spades", 2, 1);

        InDeck inDeck = deck.new InDeck();
        inDeck.printDeck();
    }
}