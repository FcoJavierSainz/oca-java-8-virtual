package modulo6;

public class Employee {

  private String name;
  private String address;
  private int age;
  private int experience;
  private String phoneNumber;

  public Employee(String newName) {
    setName(newName);
  }

  public void printNameEmployee() {
    System.out.println(name);
  }

  protected void work() {
    System.out.println("Trabajar");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee clone() {
    return new Employee(this.name);
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
