package Lab2_3__1;

/**
 * Created by Alex on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyWindow window = new MyWindow();
        window.width = 423.4;
        window.height = 45.3;
        window.numberOfGlass = 43534;
        window.color = "Blue";
        window.isOpen = false;
        MyWindow window1 = new MyWindow();
        window1.width = 3423.4;
        window1.height = 423423.3;
        window1.numberOfGlass = 435234534;
        window1.color = "White";
        window1.isOpen = true;
        MyWindow window2 = new MyWindow();
        window2.width = 324.25;
        window2.height = 478.55;
        window2.numberOfGlass = 4234234;
        window2.color = "Green";
        window2.isOpen = false;
        MyWindow window3 = new MyWindow();
        window3.width = 896.25;
        window3.height = 741.36;
        window3.numberOfGlass = 78963;
        window3.color = "Black";
        window3.isOpen = false;
        MyWindow window4 = new MyWindow();
        window4.width = 78965.25;
        window4.height = 145.21;
        window4.numberOfGlass = 789654;
        window4.color = "Red";
        window4.isOpen = true;


        System.out.println(window);
        System.out.println(window1);
        System.out.println(window2);
        System.out.println(window3);
        System.out.println(window4);
    }
}
