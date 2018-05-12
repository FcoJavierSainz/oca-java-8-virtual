package modulo6.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by JavierSainz on 6/2/17.
 */
public class CarTest {

  static int MIN_VALUE = 20_000;
  public static void main(String[] args) {

    String honda = "Honda";

    List<Car> cars = getCars();

    // honda = "a";

    Searchable compactFilter = new SearchCompact();
    Searchable priceFilter = new SearchPrice();
    Searchable hondaFilter = new FindHonda();

    cars = findCars(cars, (Searchable) car -> car.getType().equals(CarType.COMPACT));

    cars = findCars(cars, (Predicate<Car>) car -> car.getCostUSD() > MIN_VALUE);

    // final local variables
    cars = findCars(cars, (Searchable) car -> car.getBrand().equals(honda));

    // cars = findCars(cars, car -> car.getModel().equals("Fit"));

    System.out.println(cars);
    System.out.println(cars.size());

    Searchable s = car -> true;

    Searchable[] filters = {car -> true};

    Runnable r = () -> {};

    r.run();

  }

  static List<Car> findCars(List<Car> cars, Searchable searchable) {
    List<Car> filteredList = new ArrayList<>();
    for (Car car : cars) {
      if (searchable.search(car)) {
        filteredList.add(car);
      }
    }
    return filteredList;
  }

  static List<Car> findCars(List<Car> cars, Predicate<Car> filter) {
    List<Car> filteredList = new ArrayList<>();
    for (Car car : cars) {
      if (filter.test(car)) {
        filteredList.add(car);
      }
    }
    return filteredList;
  }


  static List<Car> getCars() {
    ArrayList<Car> cars = new ArrayList<>(20);
    cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 19_000));
    cars.add(new Car(CarType.COMPACT, "Honda", "City", 20_000));
    cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
    cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
    cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 19_800));
    cars.add(new Car(CarType.COMPACT, "Honda", "City", 22_000));
    cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
    cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
    cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 21_000));
    cars.add(new Car(CarType.COMPACT, "Honda", "City", 19_999));
    cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
    cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
    cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 20_500));
    cars.add(new Car(CarType.COMPACT, "Honda", "City", 22_000));
    cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
    cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
    cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 19_000));
    cars.add(new Car(CarType.COMPACT, "Honda", "City", 19_000));
    cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
    cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
    return cars;
  }

}

