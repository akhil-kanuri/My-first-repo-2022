import java.util.*;

/**
 * Write a description of class Mileage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mileage
{
    /**
     * main method
     * where we are going to code
     */
    public static void main(String[] args)
    {
        double hometowork = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("How long is the period? :");
        int period = scan.nextInt();
        System.out.println("Beginning mileage? :");
        int beg = scan.nextInt();
        System.out.println("Ending mileage? :");
        int end = scan.nextInt();
        System.out.println("Number of days for work? :");
        int workdays = scan.nextInt();
        int milestravelled = end-beg;
        double workMiles = workdays*hometowork*2;
        double workFraction = workMiles/milestravelled;
        double personalFraction = 1-workFraction;
        System.out.println();
        System.out.printf("Work Fraction: %10.2f% \n", workFraction);
        System.out.printf("Personal Fraction %10.2f% \n", personalFraction);
        
    }
}
