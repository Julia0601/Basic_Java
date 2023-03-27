import java.util.Scanner;

public class Pizza {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите диаметр пиццы: ");
        int diameter = (int) scanner.nextDouble();
        int area = (int) (Math.PI * diameter * diameter);
        System.out.println("Площадь пиццы равна: " + area);
    }
}
