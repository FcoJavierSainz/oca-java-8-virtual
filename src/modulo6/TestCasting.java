package modulo6;

public class TestCasting {

  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new B();
    B b1 = new C();

    C c2 = (C) b1;

    if (b1 instanceof E) {
      System.out.println("Es una C");
      C c1 = (C) b1;

      c1.method4();
    }

    //  E IS A E
    //  E IS A C
    //  E IS A B
    //  E IS A A
    //  E IS A Object

  }
}


class A {

  void method1() {

  }

  void method2() {

  }
}

class B extends A {

  void method3() {

  }
}

class C extends B {

  void method4() {

  }
}

class D extends B {

  void method5() {

  }
}

class E extends C {

  void method6() {

  }
}

// A -> B -> C -> E
//        -> D

