package modulo7;

public class TwistInTaleNullPointerException {

  public static void main(String[] args) {
    System.out.println(Integer.parseInt("-123"));
    System.out.println(Integer.parseInt("123"));
    System.out.println(Integer.parseInt("+123"));
    System.out.println(Integer.parseInt("12345"));
    System.out.println(Integer.parseInt("0101010101", 2));
    String[][] oldLaptops = {
        {"Dell", "Toshiba", "Vaio"},
        null,
        {"IBM"},
        new String[10]
    };
    System.out.println(oldLaptops[0][0]); // line 1
    System.out.println(oldLaptops[1]); // line 2
    //System.out.println(oldLaptops[2][0]); // line 2
    System.out.println(oldLaptops[3][6]); // line 3
    System.out.println(oldLaptops[3][0].length()); // line 4
    System.out.println(oldLaptops); // line 5
  }
}

// [0] = 0x1234
// [1] = 0x0000
// [2] = 0x3142
// [3] = 0x8546

// 0x1234[0] = 0x4321
// 0x1234[1] = 0x7654
// 0x1234[2] = 0x9876

// 0x4321 = char['D', 'e', 'l', 'l']
// 0x7654 = char['T', 'o', 's', 'h' ......]
// 0x9876 = char['V', 'a', 'i', 'o']

// 0x3142[0] = 0x8392

// 0x8392 = char['I', 'B', 'M']

// --- new String[10] ----
// 0x8546[0] = 0x0000 = null
// 0x8546[1] = 0x0000 = null
// 0x8546[2] = 0x0000 = null
// 0x8546[3] = 0x0000 = null
// 0x8546[4] = 0x0000 = null
// 0x8546[5] = 0x0000 = null
// 0x8546[6] = 0x0000 = null
// 0x8546[7] = 0x0000 = null
// 0x8546[8] = 0x0000 = null
// 0x8546[9] = 0x0000 = null