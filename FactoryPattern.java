//snake aur ladder bnaunga
//board mai daalunga
import java.util.List;

public class FactoryPattern {

    public static void createSnake(Board board,List<int[]> snake)
    {
        for(int[] it:snake)
        {
            board.setSnake(it[0],it[1]);
        }
    }
    public static void createLadder(Board board,List<int []> ladder)
    {
        for(int [] it:ladder)
        {
            board.setLadder(it[0],it[1] );
        }
    }
    
}
