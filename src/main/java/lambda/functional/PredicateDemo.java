package lambda.functional;

import java.util.function.Predicate;

class PredicateImpl implements Predicate<Integer>{

    @Override
    public boolean test(Integer t) {
        if (t%2==0){
            return true;
        }else{
            return false;
        }
    }
}

public class PredicateDemo {
    public static void main(String[] args) {
//        Predicate<Integer> predicate = new PredicateImpl();
//        System.out.println(predicate.test(7));

        Predicate<Integer> predicate = (t) -> {
            if (t % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(predicate.test(8));
    }
}
