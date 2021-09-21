import java.util.Scanner;

public class loan_repayment_calc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Loan Amount:");
        double amount = scanner.nextInt();

        System.out.println("Enter Duration(# of Months):");
        double duration = scanner.nextInt();

        double RATE = 0.1, amount_owed = amount, payment = 0;
        int month = 0;

        while (month < duration) {
            payment = amount_owed * RATE;
            amount_owed -= payment;
            month++;

            System.out.println("\n\n MONTH--" + month + "| Payment: $" + payment + " | Remaining Amount: $"
                    + amount_owed + "\n\n");

        }
    }

}
