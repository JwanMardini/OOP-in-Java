package task2;

import java.util.ArrayList;

public class Main {
    public ArrayList<DeckOfCards> DeckOfCards(){
        ArrayList<DeckOfCards> cards = new ArrayList<>();
        DeckOfCards.Cards[] num = new DeckOfCards.Cards[DeckOfCards.Cards.values().length];
        DeckOfCards.Shapes[] shape = new DeckOfCards.Shapes[DeckOfCards.Shapes.values().length];

        int i = 0;
        for (DeckOfCards.Cards c : DeckOfCards.Cards.values()) {
            num[i] = c;
            i++;
        }

        int t = 0;
        for(DeckOfCards.Shapes c : DeckOfCards.Shapes.values()){
            shape[t] = c;
            t++;
        }


        for(int e = 0; e < shape.length; e++){
            for(int o = 0; o < num.length; o++ ){
                DeckOfCards card = new DeckOfCards(num[o], shape[e]);
                cards.add(card);
                }
            }
        return cards;
    }

    public static void main(String[] args) {
        Main main = new Main();
        for (DeckOfCards card: main.DeckOfCards()){
            System.out.println(card.getNum() + ", " + card.getShape());
        }
    }
}
