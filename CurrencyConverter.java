
/*
Currency Selection: Allow the user to choose the base currency and the target
currency.
Currency Rates: Fetch real-time exchange rates from a reliable API.
Amount Input: Take input from the user for the amount they want to convert.
Currency Conversion: Convert the input amount from the base currency to the
target currency using the fetched exchange rate.
Display Result: Show the converted amount and the target currency symbol
to the user.
*/
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("1 Rupee");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Currency");
        int Choice = sc.nextInt();
        System.out.println("Enter the Amount");
        double Amount = sc.nextDouble();
        // convert the amount
        switch (Choice) {
            case 1:
                Rupee_to_other(Amount);
                break;
            case 2:
                Dollar_to_other(Amount);
                break;
            case 3:
                Euro_to_other(Amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    public static void Rupee_to_other(double amt) {
        System.out.println("1 Rupee = " + 0.012 + " Dollar");
        System.out.println();

        System.out.println(amt + " Rupee = " + (amt * 0.012) + " Dollar");
        System.out.println();

        System.out.println("1 Rupee = " + 0.011 + " Euro");
        System.out.println();
        System.out.println(amt + " Rupee = " + (amt * 0.011) + " Euro");
        System.out.println();

    }

    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 82.86 + " Rupee");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 82.86) + " Rupee");
        System.out.println();

        System.out.println("1 Dollar= " + 0.92 + " Euro");
        System.out.println();

        System.out.println(amt + " Dollar = " + (amt * 0.92) + " Euro");
    }

    public static void Euro_to_other(double amt) {
        System.out.println("1 Euro = " + 89.64 + " Rupee");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 89.64) + " Rupee");
        System.out.println();

        System.out.println("1 Euro = " + 1.08 + " Dollar");
        System.out.println();

        System.out.println(amt + " Euro = " + (amt * 1.08) + " Dollar");
    }
}