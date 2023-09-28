import java.util.Scanner;

public class Opgave5 {
    public static void main(String[] args) {

        String navnetabel[] = new String[2];

        Scanner input = new Scanner(System.in);

        //System.out.println("Indtast 2 navne");

        //for (int i = 0; i < 2; i++)
          //  navnetabel[i] = input.next();

        //udskrivNavne(navnetabel,2);

        // Fra tavlen
        navnetabel[0] = "Søren";
        navnetabel[1] = "Morten";

        udskrivNavne(navnetabel,2);

        //for (int i = 0; i < 2; i++) {
          //  System.out.println(navnetabel[i]);
        //}

    }

    public static void udskrivNavne(String[] a, int antal) {
        for (int i = 0; i < antal; i++)
            System.out.println(a[i]);
    }
}