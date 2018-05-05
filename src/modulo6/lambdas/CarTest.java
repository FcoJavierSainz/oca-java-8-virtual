package modulo6.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by JavierSainz on 6/2/17.
 */
public class CarTest {

  public static void main(String[] args) {
    List<Car> cars = getCars();
    cars = findCompactCars(cars);
    cars = findEconomicCars(cars);
    System.out.println(cars);
    System.out.println(cars.size());

  }

  static List<Car> findCompactCars(List<Car> cars) {
    List<Car> compactCars = new ArrayList<>();
    for (Car car : cars) {
      if (car.getType().equals(CarType.COMPACT)) {
        compactCars.add(car);
      }
    }
    return compactCars;
  }

  static List<Car> findEconomicCars(List<Car> cars) {
    List<Car> twentyKCars = new ArrayList<>();
    for (Car car : cars) {
      if (car.getCostUSD() > 20000) {
        twentyKCars.add(car);
      }
    }
    return twentyKCars;
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