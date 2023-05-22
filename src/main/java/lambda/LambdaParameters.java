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
}
