package org.example;
import java.util.Random;

public class Grasshopper extends Animal{

    public Grasshopper(String name, int x, int y){
        super(name, x, y);
    }

    public void move(){
        Random random = new Random();
        int direction = random.nextInt(3);
        if (direction == 0){
            x--;
        } else if (direction == 1){
            x++;
        } else {
            y = y + 2;
        }
    }
}
