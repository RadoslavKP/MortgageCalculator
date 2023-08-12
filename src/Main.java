import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal;
        float annualInterestRate;
        byte years;

        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.print("Principal ($1K - $1M): ");
        principal = scanner.nextInt();
        if (principal >= 1000 && principal <= 1000000)
            break;
        System.out.println("Enter a number between 1,000 and 1,000,000");}


        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a number greater than 0 and equal or less than 30.");}

        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        while (true) {
            System.out.print("Period(Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter a number between 1 and equal or less than 30.");
        }

        int totalPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}