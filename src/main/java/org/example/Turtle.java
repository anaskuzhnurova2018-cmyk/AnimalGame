package org.example;
import java.util.Random;

public class Turtle extends Animal {

    public Turtle (String name, int x, int y){
        super(name, x, y); //инициализируем объекты (вызывает конструктор Animal)
    }

    public void move(){
        Random random = new Random();
        int direction = random.nextInt(3);
        if (direction == 0){
            x--;
        } else if (direction == 1){
            x++;
        } else {
            y++;
        }
    }
}
