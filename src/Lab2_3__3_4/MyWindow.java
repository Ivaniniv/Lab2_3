package Lab2_3__3_4;

/**
 * Created by Alex on 14.03.2016.
 */
public class MyWindow {
    double width, height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("Ploscha =  " + (width * height));
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        System.out.println("Ploscha stekla s nomerom " + numberOfGlass + "ravna = " + (width * height));
    }

    public MyWindow(String color, int numberOfGlass) {
        this("White", true);
        this.color = color;
        this.numberOfGlass = numberOfGlass;
        System.out.println(color + " Steklo imeet nomer " + numberOfGlass);
    }

    public MyWindow(String color, boolean isOpen) {
        this.color = color;
        this.isOpen = isOpen;
        if (isOpen != true){
            System.out.println(color + " Steklo ne dostupno");}
        else {
        System.out.println(color + " Steklo dostupno");}

    }

    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
