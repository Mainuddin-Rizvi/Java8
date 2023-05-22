package lambda.functional;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {
//        old way by class
//        Consumer<String> consumer = new ConsumerImpl();
//        consumer.accept("Mainuddin rizvi");


        //this dont need class line 5 to 11
        Consumer<String> consumer =(input)-> System.out.println(input); //lambda functional
        consumer.accept("Mainuddin Rizvi");
    }
}
