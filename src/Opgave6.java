public class Opgave6 {
    public static void main(String[] args) {

        String navnetabel[] = new String[2];

        navnetabel[0] = "Søren";
        navnetabel[1] = "Morten";

        udskrivNavne(navnetabel,2);

        System.out.println("Antal ord over 5 tegn: " + overFem(navnetabel,2));
    }

    public static void udskrivNavne(String[] a, int antal) {
        for (int i = 0; i < antal; i++)
            System.out.println(a[i]);
    }

    public static int overFem(String[] a, int antal){

        int sum = 0;

        for (int i = 0; i < antal; i++) {
            if (a[i].length() > 5)
                sum++;
        }
        return sum;
    }
}
