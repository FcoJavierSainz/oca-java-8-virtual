package modulo3;

public class Student {
    /*public void printSum(int param) {
        System.out.println("Iprimitivo");
    }*/

    /*public void printSum(double param) {
        System.out.println("Dprimitivo");
    }*/

    /*public void printSum(Double param) {
        System.out.println("DWraper");
    }*/

    /*public void printSum(byte param) {
        System.out.println("Bprimitivo");
    }*/

    public void printSum(Integer param) {
        System.out.println("IWraper");
    }

    /*public void printSum(int... param) {
        System.out.println("varArgs");
    }*/

    public static void main(String args[]) {
        int num = 5;
        Integer.parseInt("455");

        long l = Integer.MAX_VALUE + 1;

        new Student().printSum(num);
    }

    // 0111001101011;
    //num = 1001101011;
}
