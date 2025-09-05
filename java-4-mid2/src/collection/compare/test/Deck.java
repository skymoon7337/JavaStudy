package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck(){
        createCard();
        shuffleCard();
    }

    private void shuffleCard() {
        Collections.shuffle(cards);
    }

    private void createCard() {
        for (int i = 1; i <= 13; i++) {
            for (Mark mark : Mark.values()) {
                cards.add(new Card(i,mark));
            }
        }
    }

    public Card drawCard(){
        return cards.remove(0); // 배열이 크면 LinkedList
    }
}
