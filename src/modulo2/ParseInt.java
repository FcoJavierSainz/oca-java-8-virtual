package modulo2;

public class ParseInt {
    public static void main(String[] args) {
        System.out.println(parseIntValidated(null));
    }

    public static int parseInt(String text) {
        int result = 0;
        for (int index = 0; index < text.length(); index++) {
            result = result *  10 + (text.charAt(index) - '0');
        }
        return result;
    }

    // 0 + 5 = 5
    // 5 * 10 + 6 =  56
    // 56 * 10 + 0 =  560
    // 560 * 10 + 8 = 5608
    // 5608 * 10 + 9 = 56089


    public static int parseIntValidated(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int result = 0;
        for (int index = 0; index < text.length(); index++) {
            int number = text.charAt(index) - '0';
            if (number < 0 || number > 9) {
                return 0;
            }
            result = result *  10 + number;
        }
        return result;
    }

}
