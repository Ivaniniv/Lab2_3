package Lab2_3__3_4;

/**
 * Created by Alex on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyWindow window = new MyWindow(423.4, 45.3);
        window.numberOfGlass = 43534;
        window.color = "Blue";
        window.isOpen = false;
        MyWindow window1 = new MyWindow(3423.4, 423423.3, 435234534);
        window1.color = "White";
        window1.isOpen = true;
        MyWindow window2 = new MyWindow("Green", 4234234);
        window2.width = 324.25;
        window2.height = 478.55;
        window2.isOpen = false;
        MyWindow window3 = new MyWindow("Black", true);
        window3.width = 896.25;
        window3.height = 741.36;
        window3.numberOfGlass = 78963;
        MyWindow window4 = new MyWindow("Red", false);
        window4.width = 78965.25;
        window4.height = 145.21;
        window4.numberOfGlass = 789654;



        System.out.println(window);
        System.out.println(window1);
        System.out.println(window2);
        System.out.println(window3);
        System.out.println(window4);
    }
}
