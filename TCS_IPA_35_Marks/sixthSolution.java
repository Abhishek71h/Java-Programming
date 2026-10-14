package TCS_IPA_35_Marks;
import java.util.*;

public class sixthSolution {

    public static double calculateInterest(Account account, int noOfYears) {
        double a = (account.getInterestRate() * noOfYears)/100; 
        double b = a + account.getInterestRate();
        double c = (account.getBalance() * b)/100;
        return c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        double balance = sc.nextDouble();
        double interestRate = sc.nextDouble();
        int noOfYears = sc.nextInt();
        Account account = new Account(id, balance, interestRate);
        double ans = calculateInterest(account, noOfYears);
        System.out.printf("%.3f", ans);
        sc.close();
    }
}

class Account {
    private int id;
    private double balance;
    private double interestRate;

    public Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}