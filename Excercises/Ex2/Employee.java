package nguyennhathuy_5372.Lec10_Abstraction.Excercises.Ex2;

public abstract class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Employee name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }

    public abstract double calculateSalary();
}
