import java.util.Scanner;

public class Lab_04_Part3_YearlyMaintenanceCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double stringWinter;
        double stringSpring;
        double stringSummer;
        double stringFall;
        double doubleYearly;

        System.out.println("Please enter your maintenance cost for Winter.");
        double doubleWinter = scan.nextDouble();

        System.out.println("Your Winter maintenance cost is $" + doubleWinter + ".");


        System.out.println("Please enter your maintenance cost for Spring.");
        double doubleSpring = scan.nextDouble();


        System.out.println("Your Spring maintenance cost is $" + doubleSpring + ".");

        System.out.println("Please enter your maintenance cost for Summer.");
        double doubleSummer = scan.nextDouble();


        System.out.println("Your Summer maintenance cost is $" + doubleSummer + ".");

        System.out.println("Please enter your maintenance cost for Fall.");
        double doubleFall = scan.nextDouble();


        System.out.println("Your Fall maintenance cost is $" + doubleFall + ".");

         doubleYearly = doubleWinter + doubleSpring + doubleSummer + doubleFall;
        System.out.println("The total yearly cost for your maintenance is $" + doubleYearly + ".");
    }
}
