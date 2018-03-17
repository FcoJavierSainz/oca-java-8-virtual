package modulo5;

/**
 * Created by JavierSainz on 6/18/16.
 */
public class LabelsExample {
    public static void main(String[] args) {
        label1();
        label2();
    }

    public static void label1() {
        String o = "";
        z:
        for (int x = 2; x < 7; x++) {
            if (x == 3) continue;
            if (x == 5) break z;
            o = o + x;
        }
        System.out.println(o);
    }

    public static void label2() {
        String o = "";
        z:
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 2; y++) {
                if (x == 1) break;
                if (x == 2 && y == 1) break z;
                o = o + x + y;
            }
        }
        System.out.println(o);
    }

//  public static void label3(){
//    String o = "";
//    z:
//      o = o + 2;
//       for(int x = 3; x < 8; x++) {
//         if(x==4) break;
//         if(x==6) break z;
//       o = o + x;
//       }
//       System.out.println(o);
//  }
}
