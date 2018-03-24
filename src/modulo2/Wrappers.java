package modulo2;

public class Wrappers {
    public static void main(String[] args) {
        Boolean bool1 = true;
        Character char1 = 'a';
        Byte byte1 = 10;
        Double double1 = 10.98;

        Boolean bool2 = new Boolean(true);
        Character char2 = new Character('a');
        Byte byte2 = new Byte((byte) 10);
        Double double2 = new Double(10.98);

        Boolean bool3 = new Boolean("true");
        Byte byte3 = new Byte("10");
        Double double3 = new Double("10.98");

    }
}
