package Lab2_3__2;

/**
 * Created by Alex on 14.03.2016.
 */
public class MyWindow {
    double width, height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow() {


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
