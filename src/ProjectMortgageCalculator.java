import java.text.NumberFormat;
import java.util.Scanner;

public class ProjectMortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;


                Scanner scanner = new Scanner(System.in);
//    infinite loop
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 10000 && principal <= 1_000_000)
            break;
            System.out.println("Enter a value between 1000 and 1000000");
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest<= 30);
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            break;
        }
        System.out.println("Enter a value between 1 and 30");
        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            numberOfPayments = years * MONTHS_IN_YEAR;
            if (years >= 1 && years <= 30)
            break;
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgate = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgate);
        System.out.println("Mortgate: " + mortgageFormatted);


    }
}
