import java.util.Scanner;

public class Lab_04_Part3_YearlyMaintenanceCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double doubleYearly;
        double stringWinter;
        double stringSpring;
        double stringSummer;
        double stringFall;

        System.out.println("Please enter your maintenance cost for Winter.");
        double doubleWinter = scan.nextDouble();

        System.out.println("Your Winter maintenance cost is " + doubleWinter + ".");


        System.out.println("Please enter your maintenance cost for Spring.");
        double doubleSpring = scan.nextDouble();


        System.out.println("Please enter your maintenance cost for Summer.");
        double doubleSummer = scan.nextDouble();


        System.out.println("Please enter your maintenance cost for Fall.");
        double doubleFall = scan.nextDouble();


        System.out.println("The total yearly cost for your maintenance is $" + doubleYearly + ".");
        double doubleYearly = scan.nextDouble();

    }
}