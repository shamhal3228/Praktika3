package com.company;

public class Square extends Rectangle{

    public Square(){}

    public Square(double side)
    {
        this.width=side;
        this.length=side;
    }

    public Square (double side, String color, boolean filled)
    {
        this.width=side;
        this.length=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide()
    {
        return length;
    }
    public void setSide(double side)
    {
        this.width=side;
        this.length=side;
    }

    public void setLength(double length)
    {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "This is square";
    }
}