package modulo7;

class EJavaBase {

  void myMethod() throws ExceptionInInitializerError {
    System.out.println("Base");
  }
}

class EJavaDerived extends EJavaBase {

  @Override
  void myMethod() throws RuntimeException {
    System.out.println("Derived");
  }
}

public class EJava3 {

  public static void main(String args[]) {
    EJavaBase obj = new EJavaDerived();
    obj.myMethod();
  }
}
