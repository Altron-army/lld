//singleton pattern board bnaunga

import java.util.HashMap;
import java.util.Map;
public class Board {
    private static Board board;
    int size;
    private Map<Integer,Integer> snake;
    private Map<Integer,Integer> ladder;
    private Board(int size){
        this.snake=new HashMap<>();
        this.ladder=new HashMap<>();
        this.size=size;
    }
        public static Board getBoard() {
        return board;
    }
    public int getSize() {
        return size;
    }
    public Map<Integer, Integer> getSnake() {
        return snake;
    }
    public Map<Integer, Integer> getLadder() {
        return ladder;
    }
        public static Board getBoard(int size)
        {
            if(board==null)
            {
                board=new Board(size);
            }
            return board;
        }
        public void setSnake(int start,int end) {
            snake.put(start,end);
        }
        public void setLadder(int start,int end) {
            snake.put(start,end);
        }
    
}
