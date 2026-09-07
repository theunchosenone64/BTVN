package nguyennhathuy_5372.Lec07_Strings;

public class Ex3 {

    public static void main(String[] args) {
        String first = "Duy Tan";
        String second = " University";

        String result1 = first + second;
        System.out.println("Using +: " + result1);

        String result2 = first.concat(second);
        System.out.println("Using concat: " + result2);

        first.concat(second);
        System.out.println("first after concat without reassignment: " + first);
    }
}
