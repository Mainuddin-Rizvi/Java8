package lambda;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print();

    default void m1(){
        System.out.println("default method");
    }

    static void m2(){
        System.out.println("static method");
    }
}

// @FunctionalInterfce annotation after 8 version
// any number of default and static method but only one abstract method
