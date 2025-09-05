package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> ownCards;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        this.ownCards = new ArrayList<>();
    }

    public void addCard(Card card){
        ownCards.add(card);
    }

    public void drawCard(Deck deck){
        ownCards.add(deck.drawCard());
    }

    public int rankSum(){
        int sum = 0;
        for (Card card : ownCards) {
            sum += card.getRank();
        }
        return sum;
    }

    public void showAll(){
        ownCards.sort(null);
        System.out.println(name+"의 카드: "+ownCards+", 합계: "+rankSum());
    }
}
