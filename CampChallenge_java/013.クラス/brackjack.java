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
public class brackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dealer D = new Dealer();
        User U = new User();

        int battleU = 0;
        int battleD = 0;

        ArrayList<Integer> dealCardsD = D.deal();
        D.setCards(dealCardsD);

        boolean sumD = D.checkSum();

        /*if (sumD == true) {
            
            ArrayList<Integer> hitCards = D.hit();
            D.setCards(hitCards);
           

        } else if (sumD == false) {
            battleD = D.open();
            
        }*/
        while (D.open() < 17) {
            ArrayList<Integer> hitCards = D.hit();
            D.setCards(hitCards);
        }
        battleD = D.open();
        System.out.print("Dealerのカードは" + battleD + "です。<br>");
        //System.out.print("ここまでがDealerのターン");

        ArrayList<Integer> dealCardsU = D.deal();
        U.setCards(dealCardsU);
        // D.setCards(D.deal());
        //for (boolean x = false; x = true;) {

        boolean sumU = U.checkSum();

        /*if (sumU == true) {
            ArrayList<Integer> hitCards = D.hit();
            U.setCards(hitCards);
        } else if (sumU == false) {
            battleU = U.open();
           
        }*/
        while (U.open() < 17) {
            ArrayList<Integer> hitCards = D.hit();
            U.setCards(hitCards);
        }
        battleU = U.open();
        System.out.print("Userのカードは" + battleU + "です。<br>");

        //System.out.print("ここまでがUserのターンです");
        // public int Battle() {
        if (battleD > 21 && battleU > 21) {
            System.out.print("draw!!");
        } else if (battleD >= 22 &&  battleD > battleU) {
            System.out.print("WINNER User!!");
        }else if (battleD > battleU && battleD < 22 ){
            System.out.print("WINNER Dealer!!");
        } else if (battleD < battleU && battleU < 22 ) {
            System.out.print("WINNER User!!");
        } else if (battleD < battleU && 22 <= battleU){
            System.out.print("WINNER Dealer!!");
        } else if (battleD == battleU) {
            System.out.print("draw!!");
        }
    }

}
