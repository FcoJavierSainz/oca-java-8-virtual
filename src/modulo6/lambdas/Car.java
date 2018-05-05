package modulo6.lambdas;


/**
 * Created by JavierSainz on 6/2/17.
 */
public class Car {
  private CarType type;
  private String brand;
  private String model;
  private double costUSD;

  public Car(CarType type, String brand, String model, double costUSD) {
    this.type = type;
    this.brand = brand;
    this.model = model;
    this.costUSD = costUSD;
  }

  public CarType getType() {
    return type;
  }

  public void setType(CarType type) {
    this.type = type;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getCostUSD() {
    return costUSD;
  }

  public void setCostUSD(double costUSD) {
    this.costUSD = costUSD;
  }

  @Override
  public String toString() {
    return "Car{" +
        "type=" + type +
        ", brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", costUSD=" + costUSD +
        '}';
  }
}
