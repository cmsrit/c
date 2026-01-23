class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double s) {
        savingsBalance = s;
    }

    static void modifyInterestRate(double x) {
        annualInterestRate = x;
    }

    void calculateMonthlyInterest() {
        double interest = (savingsBalance * annualInterestRate / 100) / 12;
        savingsBalance += interest;
    }

    void display() {
        System.out.println(savingsBalance);
    }
}

public class SavingsAccountMain {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver1.display();
        saver2.display();

        SavingsAccount.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver1.display();
        saver2.display();
    }
}
