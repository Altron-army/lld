import java.util.Arrays;

public class SnakeAndLadderGame {
    public static void main(String[] args) {
        //step1 Board ready
        Board board = Board.getBoard(100);
        //step2 snake and ladder place on board
        FactoryPattern.createSnake(board, Arrays.asList(new int[][]{{16, 6}, {48, 26}, {49, 11}, {56, 53}, {62, 19}, {64, 60}, {87, 24}, {93, 73}, {95, 75}, {98, 78}}));
        FactoryPattern.createLadder(board, Arrays.asList(new int[][]{{1, 38}, {4, 14}, {9, 31}, {21, 42}, {28, 84}, {36, 44}, {51, 67}, {71, 91}, {80, 100}}));
        //step3: decide the players
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        //step4: add player on board
        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
        //step5: dice pick
        DiceStrategy dice = new NormalDice();
        while (true) {
            //step6: game start and through dice and play until not reach to end
            Player currentPlayer=game.getCurrentPlayer();
            int diceRoll = dice.rollDice();
            Command moveCommand = new MoveCommand(currentPlayer, diceRoll, board);
            moveCommand.execute();
            game.notifyPlayers(currentPlayer.getName() + " rolled a " + diceRoll + " and moved to " + currentPlayer.getPosition());
            if (currentPlayer.getPosition() == board.getSize()) {
                game.notifyPlayers(currentPlayer.getName() + " wins!");
                break;
            }
            game.nextTurn();
 
        }
    }
}
