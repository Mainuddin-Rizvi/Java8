package lambda.functional;

import java.util.function.Function;

//old way
class FunctionImpl implements Function<String,Integer>{ //<T String is parameter type ,R Integer is return type >

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> function = new FunctionImpl();
        System.out.println(function.apply("mainuddin"));
    }
}

//Function  utility in java.util
//check it many functional interface is availbale and you can do it your implementeation

