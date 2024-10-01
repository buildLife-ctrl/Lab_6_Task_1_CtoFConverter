import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // variable
        double celsiusInput;
        double fahrenheit;
        boolean checks = false;

        //checks for validation and loops until valid
        do {
            //asks the user
            System.out.println("Enter the degrees in celsius to be converted to degrees fahrenheit:");
            if (scan.hasNextDouble()) {
                celsiusInput = scan.nextDouble();
                checks = true;
                //calculates here
                fahrenheit = (celsiusInput * 9/5) + 32;
                System.out.printf("%-12s %6.2f", "Celsius: ", celsiusInput);
                System.out.printf("\n%-12s %6.2f", "Fahrenheit:", fahrenheit);
            } else {
                System.out.println("Looks like you have entered the wrong data type, please try again.");
            }
            scan.nextLine();
        } while (!checks);
    }
}