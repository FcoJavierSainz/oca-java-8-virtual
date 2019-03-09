package modulo7;

public class NotCheckedException {

  public void myMethod() throws MyException {
    throw new MyException();
  }

  public static void main(String[] args) {
    new NotCheckedException().myMethod();
  }
}

class MyException extends RuntimeException {

}