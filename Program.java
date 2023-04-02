import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random rd = new Random();
        int a = rd.nextInt(899) + 100;
        int b = a / 100;
        int c = (a / 10) % 10;
        int d = a % 10;
        if (b >= c && b >= d) {
            System.out.println("В числе " + a + " наибольшая цифра " + b);
        } else if (c >= b && c >= d) {
            System.out.println("В числе " + a + " наибольшая цифра " + c);
        } else {
            System.out.println("В числе "+a+" наибольшая цифра " +d);
        }
    }
}
