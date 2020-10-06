import java.util.Arrays;
import java.util.Random;
public class Main
{

    public static void main(String[] args)
    {
        Random rand = new Random();
        int [] sizes = {100, 1000, 100000, 1000000};
        int [] myArray = {};

        // Create Pancake Sort Object
        PancakeSort stackOJacks = new PancakeSort(myArray);

        /* Create up to 4 unsorted/sorted pairs of arrays of sizes from the array sizes[] */
        for (int j = 0; j < 4; j++)
        {
            // Create new sized array and fill it with random elements
            myArray = new int[sizes[j]];
            for (int i = 0; i < sizes[j]; i++) {
                myArray[i] = rand.nextInt(1000000);
            }

            // Declare Pancake Sort Object 
            stackOJacks = new PancakeSort(myArray);

            // Print the unsorted array
            System.out.println("Unsorted Array: ");
            System.out.println(Arrays.toString(myArray));

            // Print the sorted Array
            System.out.println("Sorted Array: ");
            System.out.println(Arrays.toString(stackOJacks.pancakeSort()));

            // Print space between pairs of arrays
            for (int i = 0; i < 4; i++) {
                System.out.println();
            }
        }

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
