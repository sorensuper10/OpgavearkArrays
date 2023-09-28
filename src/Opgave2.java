import java.util.Scanner;

public class Opgave2 {
    public static void main(String[] args) {
        int tabel[] = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast 10 tal");

        for (int i = 0; i < 10; i++)
            tabel[i] = input.nextInt();

        udskrivArray(tabel,10);
        double snit = gennemsnit(tabel,10);
        System.out.println(snit);
    }

    public static void udskrivArray(int [] a, int antal) {
        for (int i = 0; i < antal; i++)
            System.out.println(a[i]);
    }

    public static double gennemsnit(int[] a, int antal) {
        int sum = 0;
        for (int i = 0; i < antal; i++) {
            sum += a[i];
        }
        return sum / (double) antal;
    }
}
