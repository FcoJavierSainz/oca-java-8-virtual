package modulo5;

public class CompareSwitch {

  public static void usingIf() {
    String day = "MON";

    if (day.equals("MON") || day.equals("TUE") || day.equals("WED") || day.equals("THU")) {
      System.out.println("Time to work");
    } else if (day.equals("FRI")) {
      System.out.println("Nearing weekend");
    } else if (day.equals("SAT") || day.equals("SUN")) {
      System.out.println("Weekend!");
    } else {
      System.out.println("Invalid day?");
    }


    switch (day) {
      /*case "MON":
        System.out.println("Is monday!");
        System.out.println("Additional sentence");*/
      case "TUE":
      case "WED":
      case "THU":
        System.out.println("Time to work");
        break;
      case "FRI":
        System.out.println("Nearing weekend");
        break;
      case "SAT":
      /*case null:
        System.out.println("Weekend!");
        break;*/
      default:
        System.out.println("Invalid day?");
    }


  }

  public static void main(String[] args) {
    usingIf();
  }
}
