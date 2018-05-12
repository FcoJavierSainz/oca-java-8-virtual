package modulo7;

class RiverRafting {

  void crossRapid(int degree) throws FallInRiverException {
    System.out.println("Cross Rapid");
    if (degree > 10) {
      throw new FallInRiverException();
    }
  }

  void rowRaft(String state) throws DropOarException {
    System.out.println("Row Raft");
    if (state.equals("nervous")) {
      throw new DropOarException();
    }
  }

  public static void main(String[] args) {
    RiverRafting riverRafting = new RiverRafting();
    try {
      riverRafting.crossRapid(11);
      riverRafting.rowRaft("happy");
      System.out.println("Enjoy River Rafting");
    } catch (FallInRiverException e1) {
      System.out.println("Get back in the raft");
    }
    catch (DropOarException e2) {
      System.out.println("Do not panic");
    }
    finally {
      System.out.println("Pay for the sport");
    }
    System.out.println("After the try block");

  }
}

class FallInRiverException extends Exception {

}

class DropOarException extends Exception {

}