package nguyennhathuy_5372.Lec10_Abstraction.Excercises.Ex3;

public class Processor {

    public static void main(String[] args) {
        Printable report = new Report("Quarterly Revenue Report");
        report.print();
    }
}
