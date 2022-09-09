import java.awt.*;

//Write a PerimeterTester program that constructs a Rectangle object and then computes and prints its
// perimeter. Use the getWidth and getHeight methods. Also print the expected answer.

public class ex1 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5,8);
        System.out.println("actual area="+r.getWidth()*r.getHeight());
        System.out.println("expected area ="+5*8);
        System.out.println("actual perimeter="+2*r.getHeight()*r.getWidth());
        System.out.println("expected perimeter ="+2*5*8);

    }
}
