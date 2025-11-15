package org.example;

public class Game {
    private static final int startX = 0;
    private static final int startY = 0;
    private static final int FieldWidth = 1000;
    private static final int FieldHeight = 1000;
    Animal[] array = new Animal[4];
    private int targetX;
    private int targetY;
    private int size;

    public Game(int targetX, int targetY, int size){
        this.targetX = targetX;
        this.targetY = targetY;
        this.size = size;
        array[0] = new Turtle("Черепаха", startX, startY);
        array[1] = new Grasshopper("Кузнечик", startX+1, startY);
        array[2] = new Ant("Муравей", startX+2, startY);
        array[3] = new Bee("Пчела", startX+3, startY);
    }

    void play(){
        while (true) {
            for (Animal a: array) {
                a.move();
                if (a.getX() < 0) a.setX(0);
                if (a.getX() >= FieldWidth) a.setX(FieldWidth - 1);

                if (a.getY() < 0) a.setY(0);
                if (a.getY() >= FieldHeight) a.setY(FieldHeight - 1);

                if (a.isInTarget(targetX, targetY, size)) {
                    System.out.println("Победитель: " + a.name);
                    return;
                }
            }
        }
    }
}
