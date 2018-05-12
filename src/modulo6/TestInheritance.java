package modulo6;

interface BaseInterface1 {

  default String getName() {
    return "b";
  } // change to default
}

interface BaseInterface2 {

  default String getName() {
    return "a";
  } // change to default
}

interface MyInterface extends BaseInterface1, BaseInterface2 {

  @Override
  default String getName() {
    return "c";
  }
}

class MyClass implements MyInterface {


}

public class TestInheritance {

  public static void main(String[] args) {
    MyClass myClass = new MyClass();

    BaseInterface1 b1 = myClass;

    BaseInterface2 b2 = myClass;

    MyInterface mi = myClass;

    Object o = myClass;

    // IS-A , Es un

    System.out.println(b1.getName());

    System.out.println(b2.getName());

  }
}
/*
Base1, Base2 -> MyInterface
Object, MyInterface -> MyClass
 */