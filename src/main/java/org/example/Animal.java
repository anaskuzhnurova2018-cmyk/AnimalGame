package org.example;

public abstract class Animal {
    protected int x;
    protected int y;
    protected String name;

    public Animal(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y  = y;
    }

    public abstract void move();

    boolean isInTarget (int targetX, int targetY, int size){
        int leftX = targetX;
        int upY = targetY;
        int rightX = leftX + size;
        int downY = upY + size;
        return (x >= leftX && x < rightX && y >= upY && y < downY);
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }

}
