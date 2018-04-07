package modulo4;

public class TestStringBuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder("Hola");
    StringBuilder sb3 = new StringBuilder(100);
    StringBuilder sb4 = new StringBuilder(sb2);


    StringBuilder mySb =  sb2;
    // 20 chars
    // [H,o,l,a, ,a, ,t,o,d,o,s,,,,,,,,,,,]
    // 12
    // "Cadena" +  objeto;
    sb2.append(" a todos");
    System.out.println(sb2);

    sb2.insert(4, ',');
    System.out.println(sb2);

  }
}
