import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        /* Create an int[] array of a predetermined size with random elements */
        Random rand = new Random();
        int arraySize = 1000000;
        int [] myArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = rand.nextInt(1000000);
        }

        /* Create Pancake Sort Object */
        PancakeSort stackOJacks = new PancakeSort(myArray);

        /* Print the unsorted array */
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(myArray));

        /* Print the sorted Array */
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(stackOJacks.pancakeSort()));

        /* Used while testing, confirmed that arrays were sorted correctly

        boolean sorted = true;
        int i =1;
        do{
            if(myArray[i-1] > myArray[i]){
                sorted = false;
                break;
            } else
                i++;

        } while (sorted && i < arraySize);

        if(sorted)
            System.out.println("Sorted");
        else
            System.out.println("Not sorted at indexes:" + (i - 1) + " and " + i);

         */
    }
}
