import java.lang.Math;
class Shape{

    void calculateArea(){
        System.out.println("Calculating the area of the shapes");
    }
}

class Circle extends Shape{

    void calculateArea(double radius){
        System.out.println("Area of the circle with radius: "+radius+" is: "+(Math.PI*(radius*radius)));
    }
}

class Rectangle extends Shape{

    void calculateArea(double length, double breadth){
        System.out.println("Area of Rectangle with length: "+length+" and breadth: "+breadth+" is: "+(length*breadth));
    }
}
class Square extends Shape{
    void calculateArea(double sides){
        System.out.println("Area of Square with sides : "+sides+" is: "+(sides*sides));
    }
}



public class q14 {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Square sq1 = new Square();

        s1.calculateArea();
        c1.calculateArea(1.56);
        r1.calculateArea(25,66);
        sq1.calculateArea(256);
    
    }
    
}
