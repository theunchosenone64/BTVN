package nguyennhathuy_5372.Lec10_Abstraction.Excercises.Ex2;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
