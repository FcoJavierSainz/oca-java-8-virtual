package modulo5;

import java.util.ArrayList;
import java.util.Iterator;

public class WhileLoop {

  public static void main(String[] args) {
    ArrayList<String> exams = new ArrayList<String>();
    exams.add("Java");
    exams.add("Oracle");
    Iterator it = exams.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

  }
}
