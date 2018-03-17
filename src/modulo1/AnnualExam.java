package modulo1;


public class AnnualExam {
    double score = 100;
    AnnualExam() {
        ExamQuestions.print();
        ExamQuestions.marks = 180;
    }

    public static void main(String[] args) {
        new AnnualExam();
    }
}
