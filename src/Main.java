import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("Period(Years): ");
        int period = scanner.nextInt();

        float monthlyInterestRate = annualInterestRate / 12;
        int totalPayments = period * 12;
        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        System.out.println("Mortgage: $" + mortgage);
    }
}