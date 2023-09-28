import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Opgave 1
        int tabel[] = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast 10 tal");

        for (int i = 0; i < 10; i++)
            tabel[i] = input.nextInt();

        /*for (int i = 0; i < 10; i++) {
            System.out.println(tabel[i]);
        }*/
       /* for (int i = 0; i < 10; i++) {
            System.out.println(tabel[i] + 2);
        }*/

        int sum = 0;
        for (int i =0; i<10; i++)
            sum += tabel[i];

        double snit = sum/10.0;
        System.out.println("Gennemsnittet er " +snit);

        int max = tabel[0];
        for (int i = 1; i<10; i++){
            if (tabel[i] > max)
                max = tabel[i];
        }
        System.out.println("Det største tal er " + max);

        int min = tabel[0];
        for (int i = 1; i < 10; i++) {
            if (tabel[i] <   min)
                min = tabel[i];
        }
        System.out.println("Det mindste tal er " + min);

        // Fra tavlen
        /*for (int i = 0; i < 10; i++) {
            tabel[i] += 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(tabel[i]);*/
        }
    }

