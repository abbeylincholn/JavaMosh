import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

// while loop is used when we dont know ahead of time how many times we want to repeat something.
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);


        }
    }
}
