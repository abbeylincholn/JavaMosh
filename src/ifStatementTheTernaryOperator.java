public class ifStatementTheTernaryOperator {
    public static void main (String[] args) {
        int income = 120_000;
        String className = income < 100_000 ? "First" : "Economy";  // ternary Operator
        System.out.println(className);
    }
}
