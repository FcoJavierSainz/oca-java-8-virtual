package modulo7;

public class ThrowAnotherNullPointerException {
    static String[] oldLaptops;
    public static void main(String[] args) {
        // System.out.println(oldLaptops[1]);
        String[] newLaptops = new String[2];
        System.out.println(newLaptops[1].toString());
    }
}
 // [0] = 0x0000 = null
 // [1] = 0x0000 = null