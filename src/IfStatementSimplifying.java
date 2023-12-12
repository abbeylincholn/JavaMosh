public class IfStatementSimplifying {
    public static void main (String[] args) {
        int income = 100_001;
        boolean hasHighIncome = (income > 100_000);
        if (hasHighIncome)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
