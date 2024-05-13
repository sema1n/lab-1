package checkArray;

public class displayArray {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9} ;
        int wanted = 7;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == wanted) {
                System.out.println("we have found it" + i);
                break;
            }

        }
    }
}

