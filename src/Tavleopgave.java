import java.util.Scanner;

public class Tavleopgave {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tabel[] = new int[10];

        for (int i = 0; i < 10; i++) {
            tabel[i] = input.nextInt();

        }

        udskrivArray(tabel,10);



    }

    public static void udskrivArray(int [] a, int antal) {
        for (int i = 0; i < antal; i++)
            System.out.println(a[i]);
    }
}
