package modulo6.lambdas;

import modulo6.Employee;

public class SearchCompact implements Searchable {

  @Override
  public boolean search(Car car) {
    return CarType.COMPACT.equals(car.getType());
  }
}