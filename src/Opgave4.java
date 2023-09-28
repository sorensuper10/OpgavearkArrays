import java.util.Scanner;

public class Opgave4 {
    public static void main(String[] args) {

        int tabel[] = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast 10 tal");

        for (int i = 0; i < 10; i++)
            tabel[i] = input.nextInt();

        udskrivArray(tabel,10);
        System.out.println(max(tabel,10));
    }

    public static void udskrivArray(int [] a, int antal) {
        for (int i = 0; i < antal; i++)
            System.out.println(a[i]);
    }

    public static int max(int [] a, int antal) {
        int max = a[0];
        for (int i = 1; i < antal; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
}
