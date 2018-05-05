package modulo6;

interface Jumpable {

  int MIN_DISTANCE = 10;

  abstract String currentPosition();
}

interface Moveable {

  String MIN_DISTANCE = "FAR";

  abstract String currentPosition();
}

public class Animal implements Jumpable, Moveable {

  // A class can implement multiple interfaces with the same constant names,
  // only if a reference to the constants isn’t ambiguous.
  public String currentPosition() {
    return "Home";
  }
}