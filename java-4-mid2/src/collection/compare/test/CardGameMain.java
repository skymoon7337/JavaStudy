package collection.compare.test;

import org.jetbrains.annotations.Nullable;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어 1");
        Player player2 = new Player("플레이어 2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }
        player1.showAll();
        player2.showAll();

        Player winner = getWinner(player1, player2);

        if (winner != null){
            System.out.println(winner.getName()+" 승리");
        }else {
            System.out.println("무승부");
        }
    }

    @Nullable
    private static Player getWinner(Player player1, Player player2) {

        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if (sum1>sum2){
            return player1;
        } else if (sum1 == sum2) {
            return null;
        }else {
            return player2;
        }
    }
}
