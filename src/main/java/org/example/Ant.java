package org.example;
import java.util.Random;

public class Ant extends Animal{

    public Ant (String name, int x, int y){
        super(name, x, y);
    }

    public void move(){
        Random random = new Random();
        int direction = random.nextInt(4);
        if (direction == 0){
            x--;
        } else if (direction == 1){
            x++;
        } else if (direction == 2) {
            y++;
        } else {
            y--;
        }
    }
}
