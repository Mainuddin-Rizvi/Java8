package lambda;

class ThreadDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Run method called...");
    }

}

public class RunnableLambdaExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = ()-> {
            System.out.println("run method called using lambda");
        };

        Thread threadLambda = new Thread(runnable);
        threadLambda.start();

        Thread threadArgument = new Thread(()->{
            System.out.println("from passing lambda in thread");
        });
    }


}
