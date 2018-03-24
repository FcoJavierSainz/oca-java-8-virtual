package modulo3;

public class MethodArguments {
    public static void main(String[] args) {
        System.out.println(calcAverage(5, 10));

        printResult(10.5);

        System.out.println(daysOffWork(5, 3, 4, 5));
    }

    static double calcAverage(int marks1, int marks2) {
        double avg = 0;
        avg = (marks1 + marks2) / 2.0;
        return avg;
    }

    static void printResult(double var) {
        System.out.println(var);
    }

    public static int daysOffWork(int employeeNumber, int... days) {
        int daysOff = 0;
        for (int i = 0; i < days.length; i++)
            daysOff += days[i];
        return daysOff;
    }

}
