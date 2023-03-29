import java.util.Random;

public class Device {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(28800), b = a / 60 / 60;
        System.out.println("Остаток рабочего дня в секундах" + a);
        switch (b) {
            case 0 -> System.out.println("До конца рабочего дня осталось меньше часа");
            case 1 -> System.out.println("До конца рабочего дня остался " + b + " час");
            case 2, 3, 4 -> System.out.println("До конца рабочего дня осталось " + b + " часа");
            default -> System.out.println("До конца рабочего дня осталось " + b + " часов");
        }
    }
}