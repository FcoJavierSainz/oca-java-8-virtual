package modulo6.lambdas;

public class ThreadWithLambda {

  public static void main(String[] args) throws InterruptedException {
    Runnable r = () ->
        System.out.println("In a separate thread: " + Thread.currentThread().getName());
    Thread t = new Thread(r);
    System.out.println(Thread.currentThread().getName());
    t.start();
    t.join();
  }

}
