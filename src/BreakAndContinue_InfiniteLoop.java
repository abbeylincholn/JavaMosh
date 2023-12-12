import java.util.Scanner;

public class BreakAndContinue_InfiniteLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))  // continue move statement to the begininig of the loop
                continue;
            if (input.equals("quit"))  // breaks terminate the loop
                break;
            System.out.println(input);
        }
    }
}