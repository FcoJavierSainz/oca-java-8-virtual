package modulo7;

public class SMS {

  private String msg;
  private boolean inTransit = false;

  public void create() {
    msg = "A new Message";
  }

  public void transmit() {
    inTransit = true;
  }

  public void modify() {
    if (!inTransit) {
      msg = "new modified message";
    } else {
      throw new IllegalStateException
          ("Msg in transit. Can't modify it");
    }
  }

  public static void main(String[] args) {
    SMS sms = new SMS();
    sms.create();
    sms.transmit();
    sms.modify();
  }
}
