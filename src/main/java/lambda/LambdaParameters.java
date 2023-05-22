package lambda;

interface Addable{
    int addition(int a, int b);
}

//old way

class Addition implements Addable{

    @Override
    public int addition(int a, int b) {
        return a+b;
    }
}
public class LambdaParameters {
    public static void main(String[] args) {
        Addable addition = (a,b)->{
            return a+b;
        };

        int result = addition.addition(5, 6);
        System.out.println(result);
    }
}
