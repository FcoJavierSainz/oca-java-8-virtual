package modulo5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class While {
    public static void main(String[] args) {
        ArrayList<String> exams = new ArrayList<>();
        exams.add("Java");
        exams.add("PMP");
        Iterator<String> it = exams.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toLowerCase());
        }
    }
}
