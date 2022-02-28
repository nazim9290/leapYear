import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("This program calculates leap year.");
        System.out.println("Enter A Year : ");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear)
        {
            System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
    }


}
