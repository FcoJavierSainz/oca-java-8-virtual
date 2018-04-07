package modulo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class TestArrayList {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");//0
    list.add("B");//1
    list.add("C");
    list.add("D");
    list.add("E");//4
    list.add(4, "G");
    System.out.println(list);

    for (String cadena: list) {
      //System.out.println(cadena);
    }

    ListIterator<String> it = list.listIterator();

    while(it.hasNext()) {
      it.next();
    }


    list.set(4, "H");
    list.add("H");
    System.out.println(list);
    list.remove("H");
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("A");//0
    list2.add("B");//1
    list2.add("C");
    list.addAll(list2);
    System.out.println(list);

    System.out.println(list.lastIndexOf("A"));

    // clone
    list2  =  (ArrayList<String>) list.clone();
    System.out.println(list == list2);
    System.out.println("Referencias iguales = " + (list.get(0) == list2.get(0)));


    Object[] array = list.toArray();
    System.out.println(Arrays.deepToString(array));

    list.equals(list);
    list.clear();
    System.out.println(list);
  }
}
