import java.util.Random;

public class Coin {
    private CoinValue value; //laver plads til enuminstans

    public Coin(){ //konstruktør kalder flip når der laves ny instans af mønt så den flipper fra start
        flip();
    }

    public CoinValue getValue(){ //getter, returnere CoinValue datatype og giver value
        return value;
    }

    void flip (){
        Random random = new Random();
        boolean boolValue = random.nextBoolean(); //random true eller false

        if (boolValue == true){
            value = CoinValue.HEADS;
        } else
            value = CoinValue.TAILS;

        //fancy måde at gøre det samme som if statemetet ovenover
        //       (if)?   (true)       :  (false)
        value = true ? CoinValue.HEADS : CoinValue.TAILS;
        //hvis value er true skal den være heads og hvis false tails
        //ternary operator. Betyder tredelt fordi det er den eneste metode der tager tre parametre
        //kan kun returnere to værdier og man skal ikke overdo it da det er svært at læse
    }
}
