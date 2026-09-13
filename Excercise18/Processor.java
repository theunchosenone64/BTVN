package nguyennhathuy_5372.Lec11_Encapsulation.Excercise18;

public class Processor {

    public static void main(String[] args) {
        Student student = new Student();

        student.addInfo();

        student.addGrade(8.0);
        student.addGrade(7.5);
        student.addGrade(9.0);

        student.display();
    }
}
