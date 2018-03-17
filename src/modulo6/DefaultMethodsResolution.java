package modulo6;

/**
 * Created by JavierSainz on 6/18/16.
 */
interface A {
    void print2();
    default void print() {
        System.out.println("A");
    }
}

interface B extends A {
    void print2();
    default void print() {
        A.super.print();
        System.out.println("B");
    }
}
class C {
}
public class DefaultMethodsResolution extends C implements A, B{

    public static void main(String[] args) {

        new DefaultMethodsResolution().print();
    }

    @Override
    public void print() {
        B.super.print();
        System.out.println("Mi clase");
    }

    @Override
    public void print2() {

    }
}
