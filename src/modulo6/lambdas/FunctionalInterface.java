package modulo6.lambdas;

@java.lang.FunctionalInterface
public interface FunctionalInterface extends OtherInterface {

  void method();

  // has the same signature that the method from Object class
  boolean equals(Object obj);

  static void staticMethod() {

  }

  default void defaultMethod() {

  }

}

interface OtherInterface {

  void method();
}