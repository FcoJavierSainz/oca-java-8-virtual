package modulo5;

import java.util.ArrayList;
import java.util.Iterator;

public class EnhancedFor {

  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Java");
    myList.add("Loop");
    myList.add("Loop");

    ArrayList<String> myList2 = new ArrayList<String>(myList);

    for (String value : myList) {
      System.out.println(value);
      //myList.remove(value);
    }

    /*for(Iterator it = myList.iterator(); it.hasNext();) {
      it.remove();
    }*/

    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i) + " " +  myList2.get(i));
    }

  }
}
