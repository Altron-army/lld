//Command Pattern for Game Moves
 interface Command {

   void execute(); 
}
public class MoveCommand implements Command {
  private Player player;
  private Board board;
  private int steps;
  public MoveCommand(Player player,int steps,Board board)
  {
     this.player=player;
     this.board=board;
     this.steps=steps;
  }
    @Override
    public void execute() {
        int newposition = player.getPosition() + steps;
        if(newposition> board.getSize())
        {
            newposition=board.getSize();
        }
        if(board.getSnake().containsKey(newposition))
        {
            newposition=board.getSnake().get(newposition);
        }
        else if(board.getLadder().containsKey(newposition))
        {
            newposition=board.getLadder().get(newposition);
        }
player.setPosition(newposition);

    }
    
}
