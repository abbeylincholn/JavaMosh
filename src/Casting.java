public class Casting {
    public static void main(String[]args) {
        //Implicit casting. data convert fm byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;...............................................
//        double x = 1.1;
//        double y = x + 2; // 2.0 + 1.1. int 2 is converted to double..................................
//          double x = 1.1;
//          int y = (int)x + 2; // 2.0 + 1.1. int 2 is converted to double...................
        //this casting works with compartible data types
        // when you have a string and want to work with int below is to do.
        //conti. this help to convert strings to numberic data
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;
        String x = "1.1";
        Double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }
}
