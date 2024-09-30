import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // variable
        double celsiusInput;
        double fahrenheit = 0;
        boolean checks = false;

        //checks for validation and loops until valid
        do {
            System.out.println("Enter the degrees in celsius to be converted to degrees fahrenheit:");
            if (scan.hasNextDouble()) {
                celsiusInput = scan.nextDouble();
                checks = true;
                fahrenheit = (9/5) * (celsiusInput) + 32;
                System.out.printf("%-9s %6.01f", "Celsius: ", fahrenheit);
            } else {
                System.out.println("Looks like you have entered the wrong data type, please try again.");
            }
            scan.nextLine();
        } while (!checks);
    }
}