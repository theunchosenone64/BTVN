package nguyennhathuy_5372.Lec10_Abstraction.Excercises.Ex4;

public class Circle implements Drawable, Colorable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling color for the circle");
    }
}
