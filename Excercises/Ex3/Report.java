package nguyennhathuy_5372.Lec10_Abstraction.Excercises.Ex3;

public class Report implements Printable {

    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Report: " + title);
    }
}
