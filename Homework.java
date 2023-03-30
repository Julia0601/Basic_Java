import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature of the first flask: ");
        int temperature1 = sc.nextInt();
        System.out.print("Enter pls temperature of the second flask: ");
        int temperature2 = sc.nextInt();
        sc.close();


        if (temperature1 > 100 && temperature2 < 100)
            System.out.println("The device is working correctly");
        else
            System.out.println("The device does not work correctly");


    }
    }

