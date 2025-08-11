package collection.compare.test;

import org.jetbrains.annotations.NotNull;

public class Card implements Comparable<Card>{
    private final int rank;
    private final Mark mark;

    public Card(int rank, Mark mark) {
        this.rank = rank;
        this.mark = mark;
    }

    public int getRank() {
        return rank;
    }

    public Mark getMark() {
        return mark;
    }


    @Override
    public int compareTo(@NotNull Card anotherCard) {
        if(this.rank != anotherCard.rank){
            return Integer.compare(this.rank,anotherCard.rank);
        } else{
            return this.mark.compareTo(anotherCard.mark);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + mark.getIcon()+")";
    }
}
