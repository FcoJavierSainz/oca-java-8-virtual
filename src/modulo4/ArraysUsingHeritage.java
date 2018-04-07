package modulo4;

public class ArraysUsingHeritage {

  public static void main(String[] args) {
    Vehicle[] vehicleArray = {
        new Car(),
        new Bus(),
        null
    };
  }
}

abstract class Vehicle {

}

class Car extends Vehicle {

}

class Bus extends Vehicle {

}