public class Opgave10 {
    public static void main(String[] args) {

        int talArray[] = {13,10,7,5,60,88,0,17,99,1};
        int k = 5;
        System.out.println(k+" er på index " + linearSearch(talArray,k));
        selectionSort(talArray);
        for (int i = 0; i < 10 ; i++) {
            System.out.print(talArray[i] + " ");
        }
    }
        public static int linearSearch(int[] list, int key) {
            for (int i = 0; i < list.length; i++) {
                if (key == list[i])
                    return i;
            }
            return -1;
        }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}

