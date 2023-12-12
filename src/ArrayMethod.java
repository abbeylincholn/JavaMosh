import java.util.Arrays;
// if we dont know the data ahead of time
// public class ArrayMethod {
//    public static void main (String[]args) {
//        // arrays are reference type
//        int [] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        System.out.println(Arrays.toString(numbers));
//    }
//}

// if we know the data ahead of time//fix length
//public class ArrayMethod {
//    public static void main (String[] args) {
//        int[] numbers = { 2, 3, 5, 5, 1, 4, 7};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
//    }
//}

// to sequence or sort the numbersV

// multi dimensional array
 // 2 dim
    public class ArrayMethod {
        public static void main (String[] args) {
            int[] [] numbers = new int [2] [3]; // or  = {{ 1, 2, 3}, { 4, 5, 6}} but comment the numbers below to get same
            numbers[0][0] = 1;
            numbers[0][1] = 3;
            System.out.println(Arrays.deepToString(numbers));
        }
    }