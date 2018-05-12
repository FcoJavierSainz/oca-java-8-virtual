package modulo6.lambdas;

public class SearchPrice implements Searchable {

  @Override
  public boolean search(Car car) {
    return car.getCostUSD() > 20_000;
  }
}