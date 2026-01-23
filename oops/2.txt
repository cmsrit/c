import java.text.NumberFormat;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        int SALESPEOPLE;
        int sum = 0;
        int maxman = 0;
        int maxsale = Integer.MIN_VALUE;
        int minman = 0;
        int minsale = Integer.MAX_VALUE;
        double average;

        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in);

        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];

        for (int i = 0; i < sales.length; i++) {
            sales[i] = scan.nextInt();

            if (sales[i] > maxsale) {
                maxsale = sales[i];
                maxman = i + 1;
            }

            if (sales[i] < minsale) {
                minsale = sales[i];
                minman = i + 1;
            }
        }

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        average = (double) sum / SALESPEOPLE;

        System.out.println("Total sales: " + sum);
        System.out.println("The average: " + average);
        System.out.println("Salesperson " + maxman + " had the highest sale with " + fmt.format(maxsale) + ".");
        System.out.println("Salesperson " + minman + " had the lowest sale with " + fmt.format(minsale) + ".");

        int line = scan.nextInt();
        sum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > line) {
                System.out.println((i + 1) + " " + sales[i]);
                sum += sales[i];
            }
        }

        System.out.println("Total sales for who exceeded the line: " + sum);
    }
}
