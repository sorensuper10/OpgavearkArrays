import java.util.Scanner;

public class Opgave10 {
    public static void main(String[] args) {

        int talArray[] = {13, 10, 7, 5, 60, 88, 0, 17, 99, 1};
        int k = 5;
        System.out.println(k+" er på index " + Opgave9.linearSearch(talArray,k));

        //int tabel1[] = new int[10];
        //inputTal(tabel1,10);
        //udskrivArray(tabel1,10);

    }

    public static void inputTal(int[] a, int antal) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast 10 tal");
        for (int i = 0; i < antal; i++)
            a[i] = input.nextInt();
    }

    public static void udskrivArray(int [] a, int antal) {
        for (int i = 0; i < antal; i++)
            System.out.println(a[i]);
    }
}



