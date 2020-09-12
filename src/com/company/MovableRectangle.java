package com.company;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed, int radius) {
        topLeft.x=x1;
        topLeft.y=y1;
        bottomRight.x=x2;
        bottomRight.y=y2;
        topLeft.xSpeed=xSpeed;
        bottomRight.xSpeed=xSpeed;
        topLeft.ySpeed=ySpeed;
        bottomRight.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "This is movable rectangle";
    }

    @Override
    public void moveUp() {
        topLeft.y+= topLeft.ySpeed;
        bottomRight.y+= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y-= topLeft.ySpeed;
        bottomRight.y-= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x-= topLeft.ySpeed;
        bottomRight.x-= bottomRight.ySpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x+= topLeft.ySpeed;
        bottomRight.x+= bottomRight.ySpeed;
    }
}