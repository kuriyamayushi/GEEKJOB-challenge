/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Random;

/*
 *
 * @author guest1Day
 */
 class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();

    public Dealer() {

        for (int i = 0; i < 4; i++) {

            for (int z = 1; z <= 13; z++) {
                if (z < 10) {

                    cards.add(z);
                } else if (z >= 10) {
                    // z = 10;
                    cards.add(10);

                }

                //System.out.print(cards.size());
            }
        }
        /*for (int y = 0; y<cards.size(); y++ ){
            System.out.print(cards.get(y));*/

        //int Yamahuda = (cards.size());
        //System.out.print(Yamahuda);
    }

    // メソッド作成時に記述する
    // メソッドでの具体的な処理は、deal(){ ... 以降に記述する
    public ArrayList<Integer> deal() {
        ArrayList<Integer> returnCards = new ArrayList<Integer>();

        // for 文で追加していく
        for (int i = 1; i < 3; i++) {
            Random randD = new Random();
            // 「○番目」の要素を引く、ということを決める
            // →要素番号を乱数で指定する

            Integer deal = randD.nextInt(cards.size());

            // 上で取得した乱数の要素番号で、cards からカードを一枚取得・削除する
            Integer farstcard = cards.get(deal);
            //System.out.print("引いたカードは" + farstcard);
            returnCards.add(farstcard);
        }
        //System.out.print(fastcards);
        return returnCards;
    }

    public void setCards(ArrayList<Integer> getCards) {

        //ArrayList<Integer> myCard = new ArrayList<Integer>();
        myCards.addAll(getCards);
        
        //for (int i = 0; i < myCards.size(); i++) {
           //System.out.print(myCards.get(i));
           
        }
        //System.out.print("ﾃﾌﾀﾞノゴウケイマイスウ"+myCards.size());
        
    

    public boolean checkSum() {
        

        /*for (int i = 0; i < myCards.size(); i++) {
            x += myCards.get(i);

        }*/
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
    }
//あとでけす
    //return true;

    public int open() {
        int finalCards = 0;

        for (int i = 0; i < myCards.size(); i++) {
            finalCards += myCards.get(i);

        }
        return finalCards;
    }

    public ArrayList<Integer> hit() {
        ArrayList<Integer> returnCards = new ArrayList<Integer>();
        Random randD = new Random();

        Integer hit = randD.nextInt(cards.size());

        Integer secondcard = cards.get(hit);

        returnCards.add(secondcard);
        //System.out.print("hitしたかーどは"+secondcard);
        return returnCards;

    }

    @Override
    public ArrayList<Integer> setCards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
