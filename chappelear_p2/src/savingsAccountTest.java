public class savingsAccountTest {
    public static void main(String[] args) {
        savingsAccount saver1 = new savingsAccount(2000.00);
        savingsAccount saver2 = new savingsAccount(3000.00);
        savingsAccount.modifyInterestRate(5.00);
        int i;
        System.out.println("saver1 is on the left, saver 2 is on the right:");

        for (i = 1; i <= 11; ++i) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("month " + i + ":");
            saver1.printTheBalance();
            System.out.print("     ");
            saver2.printTheBalance();
            System.out.println("");
        }
        System.out.println("Now switching the interest rate to 5 percent: ");
        savingsAccount.modifyInterestRate(5.00);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("The next month's values would be: ");
        System.out.print("saver1 = ");
        saver1.printTheBalance();
        System.out.print("     ");
        System.out.print("saver2 = ");
        saver2.printTheBalance();
    }
}
