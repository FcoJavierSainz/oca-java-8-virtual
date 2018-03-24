package modulo3;

public class Average {
    double calcAverage(int marks1, int marks2) {
        double avg = 0;
        avg = (marks1 + marks2) / 2.0;
        return avg;
    }

    double calcAverage(Integer marks1, Integer marks2) {
        return -1;
    }

    double calcAverage(int... marks1) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Average().calcAverage(4, 6));
    }




}
