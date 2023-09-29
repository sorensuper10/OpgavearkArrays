public class Opgave14 {
    public static void main(String[] args) {
        int talArray[] = {13, 10, 7, 5, 60, 88, 0, 17, 99, 1};

        Opgave13.selectionSort(talArray);
        for (int i = 0; i < 10; i++) {
            System.out.print(talArray[i] + " ");
        }
    }
}
