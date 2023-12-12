import java.text.NumberFormat;
import java.util.Scanner;

public class MortgateCalculator {
    public static void main (String[] args) {
        //Principal: 100000
        //Annual Interest Rate: 3.92, divided by 100 as percentage 0.0392
        //Period (Years): 30
        //Mortgate: $472.82
//
//        int Principal = 100000;
//        double AnnualInterestRate = 3.93;
//        int Period = 30;
//
//        int p = Principal;
//        double r = (AnnualInterestRate/100)/12;
//        int n = Period * 12;
//
//        double M = p * ((r * Math.pow((1+r),n))/(Math.pow((1+r),n)-1));
//        System.out.println(M);

// mosh solution
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Princical: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest =  scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT /MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgate = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgate);
        System.out.println("Mortgate: " + mortgageFormatted);


    }
}

