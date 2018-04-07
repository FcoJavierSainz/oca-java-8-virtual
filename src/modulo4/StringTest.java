package modulo4;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("Paul");
        String str2 = new String("Paul");
        //System.out.println(str1 == str2);

        String str3 = "Harry";
        String str4 = "Harry";
        //System.out.println(str3 == str4);

        char[] nameArray = new char[]{'P','a','u','l'};
        String boy = new String(nameArray);
        //System.out.println(boy);

        StringBuilder sd1 = new StringBuilder("String Builder");
        String str5 = new String(sd1);

        StringBuffer sb2 = new StringBuffer("String Buffer").append(" Hola");
        String str6 = new String(sb2);

        String name = new String("Paul");
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));

        String letters = "ABCAB";
        System.out.println(letters.indexOf('B'));
        System.out.println(letters.indexOf("S"));
        System.out.println(letters.indexOf("CA"));

        String exam = "Oracle";
        String sub = exam.substring(2);
        System.out.println(sub);

        String result = exam.substring(2, 4);
        System.out.println(result);

        String varWithSpaces = " AB CB ";
        System.out.print(":");
        System.out.print(varWithSpaces.trim());
        System.out.print(":");
        System.out.println();


        letters = "ABCAB";
        System.out.println(letters.replace('B', 'b'));
        System.out.println(letters.replace("CA", "12"));

        for (int i = 0; i < letters.length(); i++) {
            System.out.println(letters.charAt(i));
        }

        System.out.println(letters.startsWith("C", 2));
        System.out.println(letters.endsWith("ABCAB"));

    }
}
