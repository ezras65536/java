package poker.assets;

public class Player {
    
    public String name; 
    public double value; 
    public int id; 

    public Player(String name_, double value_, int id_) {
        this.name = name_; 
        this.value = value_; 
        this.id = id_; 
    }

    public Player(String name_, int id_) {
        this.name = name_; 
        this.value = 0.0; 
        this.id = id_; 
    }
}
