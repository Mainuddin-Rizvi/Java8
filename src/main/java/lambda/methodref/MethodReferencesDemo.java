package lambda.methodref;

import lambda.functional.FunctionDemo;

import javax.swing.*;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void  print(String msg);
}

public class MethodReferencesDemo {
    public  void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a , int b){
        return a+b;
    }


    public static void main(String[] args) {
//        Method Refernce to a static method
//        Lambda Expression

        Function<Integer,Double> function = (input)->{
            return Math.sqrt(input);
        };
        System.out.println(function.apply(6));

        //        using method reference
        Function<Integer,Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(5));

//        Lambda Expression
        BiFunction<Integer,Integer,Integer> biFunctionLambda =(a,b)->MethodReferencesDemo.addition(a,b);
        System.out.println(biFunctionLambda.apply(4,5));

//        Using Method Reference

        BiFunction<Integer,Integer,Integer> biFunction = MethodReferencesDemo::addition;
        System.out.println(biFunction.apply(6,7));




//        2. Method Reference to an instance method
        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();

//        Lambda expression

        Printable printable = (msg)->methodReferencesDemo.display(msg);
        printable.print("Hello World");

//        Method reference
        Printable printable1 = methodReferencesDemo::display;
        printable1.print("hello world");





//        Reference to the instance method of an arbiratory object
//        sometime we call a    method of arguments  in the lamda expression
//        in that case we can use a method reference  to call an instance
//        method of an arbitrary object of a specific type

//        Lambda
        Function<String ,String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("MAINUDDIN"));

//        Methodref
        Function<String ,String> stringMethodRef =  String::toLowerCase;
        System.out.println(stringMethodRef.apply("MAINUDDIN RIZVI"));

        String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};

//        using lambda
        Arrays.sort(strArray,(s1,s2)->s1.compareToIgnoreCase(s2));

//        using methodref
        Arrays.sort(strArray,String::compareToIgnoreCase);




//        4.Reference to a constructor

        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("watermelon");

//        lambda
        Function<List<String>, Set<String>> function1 = (fruitlist)->new HashSet<>(fruitlist);
        System.out.println(function1.apply(fruits));

//        method ref
        Function<List<String>, Set<String>> function2 = HashSet::new;







    }
}
