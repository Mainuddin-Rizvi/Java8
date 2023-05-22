package lambda;

interface Shape{
     void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class draw() method");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class draw() method");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class draw() method");
    }
}
public class LambdaExample {
    public static void main(String[] args) {

    }
}

//the class based is old techniques its need to write more code.
//need object to execute.
//functional interface help to cut it down the code.
