package nguyennhathuy_5372.Lec11_Encapsulation.Excercise18;

import java.util.ArrayList;

class Student {

    String id;
    String name;
    ArrayList<Double> grades = new ArrayList<>();

    void addInfo() {
        id = "SV001";
        name = "Nguyen Nhat Huy";
    }

    void addGrade(double grade) {
        grades.add(grade);
    }

    double getAverage() {
        if (grades.size() == 0) {
            return 0;
        }

        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + getAverage());
    }
}
