/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
class User extends Human {

//public class User {
    public void setCards(ArrayList<Integer> getCards) {

        //ArrayList<Integer> myCard = new ArrayList<Integer>();
        myCards.addAll(getCards);
       // for (int i = 0; i < myCards.size(); i++) {
           // System.out.print(myCards.get(i));
       // }
    }

    public boolean checkSum() {
       // int x = 0;

       // for (int i = 0; i < myCards.size(); i++) {
            /* x += myCards.get(i);

        }
        /*int a = (myCards.get(0));
        int b = (myCards.get(1));
        int c = (myCards.get(2));
        
        int sum = a + b + c;*/
            if (open() < 17) {
                return true;

            } else if (17 <= open() && open() <= 21) {
                return false;
            } else {
                return false;
            }
            /*else {
            if (21 < x)
                return false;
                }*/
      //  }
        //return false;
    }

    public int open() {
        int finalCards = 0;

        for (int i = 0; i < myCards.size(); i++) {
            finalCards += myCards.get(i);

        }
        return finalCards;
    }

    @Override
    public ArrayList<Integer> setCards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
