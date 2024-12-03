 //for play turns obervation class ---- player and game combine
 
 interface InnerObservarPattern {
void update(String message);
    
}

public class Player implements InnerObservarPattern {
private String name;
private int position;
    @Override
    public void update(String message) {
        System.out.println(name+":"+position);
    }
    Player(String name)
    {
        this.name=name;
        position=0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    } 
}


