package modulo4;

import java.util.Arrays;
import java.util.Date;

public class ArraysUsingHeritage {

  public static void main(String[] args) {
    Object[] vehicleArray = {
        new Car(),
        new Bus(),
        null,
        new Date(),
        "ABC",
        5,
        new int[]{2, 4, 5}
    };
    System.out.println(Arrays.deepToString(vehicleArray.clone()));
  }
}

abstract class Vehicle {

}

class Car extends Vehicle {

}

class Bus extends Vehicle {

}