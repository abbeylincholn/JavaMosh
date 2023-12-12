
public class LogicalOperator_ControlFlow {
    public static void main (String[] args) {
        // boolean operators
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y); // boolean expression  ( x != Y) false
        // logical operators AND %%
//        int temperature = 12;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
        // OR || operator
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && hasCriminalRecord;
        System.out.println(isEligible);

    }

}
