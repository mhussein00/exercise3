import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner input = new Scanner(System.in);

    static double getFahrienheit(double fahr) {
        return fahr;
    }

    static double conversion(double fahr) {
        double celusius = (fahr-32) * 5/9;
        return celusius;
    }

    static double display(double fahr) {
        System.out.println(fahr);
        return fahr;
    }







    public static void main(String[] args) {
        System.out.println("Please enter a number in fahrenheit:");
        double fahrienheit = input.nextDouble();

        while (fahrienheit > -460) {
            double convertedTemp = conversion(fahrienheit);
            display(convertedTemp);
            System.out.println("Please enter a number in fahrenheit:");
            fahrienheit = input.nextDouble();
        }

    }
}