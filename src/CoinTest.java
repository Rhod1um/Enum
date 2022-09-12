import java.util.Random;

public class CoinTest {
    public static void main(String[] args) {
        int headsCount=0, tailsCount=0;
        for (int i=0; i<100; i++){
            Coin coin = new Coin(); //laver ny coin hver gang den flipper
            System.out.println(coin.getValue());
            if (coin.getValue()==CoinValue.HEADS)
                headsCount++;
            else
                tailsCount++;
        }
        System.out.println("heads: " + headsCount + " tails: " + tailsCount);

        int daysToXmax=5;
        for (int i=daysToXmax; i>=0; i--){
            System.out.println("Der er " + i +
                    (i == 1 ? "dag" : " dage") +
                    "til jul");

        }
    }


}
