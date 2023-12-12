import java.awt.*;

public class dataTypes {
    public static void main (String [] args) {
        //primitve types to store simples values
//        byte age = 35;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = true;
        //................................
        // reference types to store complex data
//        Date now = new Date();
//        System.out.println(now);
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y); // primitive to confirm stuff
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point1);
    }
}

