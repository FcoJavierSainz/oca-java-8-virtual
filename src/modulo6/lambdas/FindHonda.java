package modulo6.lambdas;

public class FindHonda implements Searchable {

  @Override
  public boolean search(Car car) {
    return car.getBrand().equals("Honda");
  }
}
