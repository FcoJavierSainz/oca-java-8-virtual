package modulo2;

public class WrappersFunctions {
    public static void main(String[] args) {

        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf("TrUE");
        Integer int1 = Integer.valueOf(10);
        Integer int2 = Integer.valueOf(10);
        Integer int3 = new Integer(10);

        System.out.println(int1 == int2);
        System.out.println(int1 == int3);

        int primitive = Integer.parseInt("45");
        boolean bool3 = Boolean.parseBoolean("null");

        int primitive2 = Integer.parseInt("45_0");
    }
}
