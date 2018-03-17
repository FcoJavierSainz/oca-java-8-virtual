package modulo1;

public class ExamQuestions {
    public static int marks = 5;

    public String course;

    public static void print() {
        System.out.println(100);
    }

    public void printCourse() {
        System.out.println(course +  ", mark: " + marks);
    }

    public static void main(String[] args) {
        print();
        ExamQuestions eq = new ExamQuestions();
        ExamQuestions eq2 = new ExamQuestions();
        eq.course = "OCA Java";
        eq2.course = "OCP";

    }
}
