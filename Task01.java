import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int v = 0;
        for (int i = 0; i < arr.length; i++) {
            Random rn = new Random();
            arr[i] = rn.nextInt(10);
            System.out.print(arr[i] + " ");
            if(arr[i]> 0 && arr[i]%2==0)
                v++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве " + v +  "чётных элементов");
    }
}