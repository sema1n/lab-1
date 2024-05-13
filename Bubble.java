import java.util.Arrays;

public class Bubble {
    public static void bubbleSort(char[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] data = {'B', 'C', 'A'};
        bubbleSort(data);
        System.out.println(Arrays.toString(data));
    }
}
