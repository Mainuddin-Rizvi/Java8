package lambda;

interface Shape{
     void draw();
}

public class LambdaExample {
    public static void main(String[] args) {
        Shape rectangle = ()->System.out.println("Rectangle class draw() method");
        print(rectangle);

        Shape circle = ()->System.out.println("Circle class draw() method");
        print(circle);

        Shape square = ()->System.out.println("Square class draw() method");
        print(square);


    }
    public static void print(Shape shape){
        shape.draw();
    }
}

//the class based is old techniques its need to write more code.
//need object to execute.
//functional interface help to cut it down the code.

//functional interface need one abstract method in interface.

//lambda expression need reference variablew to assign implementation
//than call abstract method of interface eg. draw()

// passing reference variable with lambda expression into method


