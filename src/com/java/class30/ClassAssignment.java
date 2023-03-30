package com.java.class30;
class Shape{
    void draw(){
        System.out.println("From Shape draw");
    }
    void erase(){
        System.out.println("From Shape erase");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing Circle");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("drawing Square");
    }
}
public class ClassAssignment {
    public static void main(String[] args) {
        Square s=new Square();
        Circle c=new Circle();
        Shape s0=new Shape();
        s0.erase();
        s0.draw();
        s.erase();
        s.draw();
        c.erase();
        c.draw();
    }
}
