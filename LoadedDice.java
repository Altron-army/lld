//strategy  for dice roll

import java.util.Random;
interface DiceStrategy {
    int rollDice();
}
public class LoadedDice implements DiceStrategy {
    private Random random;

    public LoadedDice() {
        this.random = new Random();
    }

    @Override
    public int rollDice() {
        return random.nextInt(3) + 4;  // Rolls between 4 and 6
    }
}
