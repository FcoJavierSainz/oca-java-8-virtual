package modulo4;

import java.util.ArrayList;

public class OverrideEquals {

  public static void main(String[] args) {
    ArrayList<BankAccount> list = new ArrayList<>();
    BankAccount a1 = new BankAccount("1234", 2);
    BankAccount a2 = new BankAccount("1234", 3);

    list.add(a1);
    list.add(a2);

    BankAccount a3 = new BankAccount("1234", 2);
    System.out.println(list.contains(a3));

    System.out.println("Reflexivo");
    System.out.println(a3.equals(a3));

    System.out.println("Simetrico");
    System.out.println(a1.equals(a3));
    System.out.println(a3.equals(a1));

    BankAccount a4 = new BankAccount("1234", 2);
    System.out.println("Transitivo");
    System.out.println(a1.equals(a3));
    System.out.println(a3.equals(a4));
    System.out.println(a1.equals(a4));

    System.out.println("Consistente");
    System.out.println(a1.equals(a3));
    System.out.println(a1.equals(a3));
    System.out.println(a1.equals(a3));
    System.out.println(a1.equals(a3));
    System.out.println(a1.equals(a3));
    System.out.println(a1.equals(a3));
    System.out.println(a1.equals(a3));

  }
}

class BankAccount {

  String acctNumber;
  int acctType;

  public BankAccount(String acctNumber, int acctType) {
    this.acctNumber = acctNumber;
    this.acctType = acctType;
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj instanceof BankAccount) {
      BankAccount other = (BankAccount) obj;
      return acctNumber.equals(other.acctNumber)
          && acctType == other.acctType;
    }
    return false;
  }

}
