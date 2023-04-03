package main.java.DesignPatterns.Facade;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
