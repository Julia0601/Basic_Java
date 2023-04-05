import java.util.Scanner;

public class Lift {
    // Лифт, находящийся на первом этаже здания высотой H,// Каждый раз  поднимается на N этажей и спускается на M этажей.
    // Если на последнем подъёме лифт превысил количество этажей,то считается что лифт поднялся на самый верх.
    // Найдите количество подъёмов, которые понадобятся лифту.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Высота здания: ");
        int H = sc.nextInt();
        System.out.print("Количество этажей на которые лифт поднялся: ");
        int N = sc.nextInt();
        System.out.print("Количество этажей на которые лифт спустился: ");
        int M = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (sum < H) {
            if (N > M) {
                sum = sum + N - M;
            } else {
                System.out.println("Elevator can't move up");
                break;
            }
            count++;
        }
        System.out.println("Чтобы подняться на " + H + " этаж, лифту понадобится " + count + " подъёмов");
        sc.close();
    }
}











// while (sum < H) {
//        if (N > M) {
//        sum = sum + N - M;
//        } else {
//        System.out.println("Elevator can't move up");
//        break;
//        }
//        count++;