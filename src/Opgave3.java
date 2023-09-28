import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {
        int tabel[] = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast 10 tal");

        for (int i = 0; i < 10; i++)
            tabel[i] = input.nextInt();

        udskrivArray(tabel,10);
        System.out.println(min(tabel,10));
    }

    public static void udskrivArray(int [] a, int antal) {
        for (int i = 0; i < antal; i++)
            System.out.println(a[i]);
    }

    public static int min(int[] a, int antal) {
        int min = a[0];
        for (int i = 1; i < antal; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
}
