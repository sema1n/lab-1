import java.util.Arrays;

public class Array {
    private int[] array;

    public Array() {
        this.array = new int[]{3, 7, 1, 9, 4};
    }

    public void deleteAtIndex(int indexToDelete) {
        if (indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("Invalid index");
            return;
        }

        int[] newArray = new int[array.length - 1];
        int j = 0; // index for the new array

        for (int i = 0; i < array.length; i++) {
            if (i != indexToDelete) {
                newArray[j++] = array[i];
            }
        }

        // Replace the old array with the new array
        array = newArray;
    }

    public static void main(String[] args) {
        Array arr = new Array();
        System.out.println("Original array: " + Arrays.toString(arr.array));

        // Delete element at index 2
        arr.deleteAtIndex(2);
        System.out.println("Array after deletion: " + Arrays.toString(arr.array));
    }
}
