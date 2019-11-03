public class savingsAccount {
    private static double annualInterestRate = 0.0;
    private double savingsBalance;

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12.0;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate (double percentage) {
        annualInterestRate = percentage;
    }

    public void printTheBalance() {
        System.out.printf("$%.2f", savingsBalance);
    }

    public savingsAccount(double i) {
        savingsBalance = i;
    }

}
