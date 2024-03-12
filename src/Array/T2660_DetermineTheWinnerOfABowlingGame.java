package Array;

public class T2660_DetermineTheWinnerOfABowlingGame {
    public int score(int[] player) {
        int sum = 0;
        for (int i = 0; i < player.length; i++) {
            if (i > 0 && player[i-1] == 10 || i > 1 && player[i-2] == 10){
                sum += player[i] * 2;
            } else sum += player[i];
        }
        return sum;
    }

    public int isWinner(int[] player1, int[] player2) {
        int sum1 = 0, sum2 = 0;
        sum1 = score(player1);
        sum2 = score(player2);
        if (sum1 == sum2) {
            return 0;
        }
        return sum1 > sum2 ? 1 : 2;
    }
}