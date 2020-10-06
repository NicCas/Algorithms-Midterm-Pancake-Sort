import java.util.Arrays;

public class PancakeSort
{
    private int[] pancakeArray;

    public PancakeSort(int[] userArray)
    {
        pancakeArray = userArray;
    }

    /* Flips array [0] with array [argument] */
    private void flip (int indexToFlip)
    {
        int temp;
        int start = 0;
        while (start < indexToFlip)
        {
            temp = pancakeArray[start];
            pancakeArray[start] = pancakeArray[indexToFlip];
            pancakeArray[indexToFlip] = temp;

            start++;
            indexToFlip--;
        }
    }

    /* Pancake sort called by user, returns a sorted array */
    public int[] pancakeSort()
    {
        // Last index is the pivot, pivot changes to the next lowest index. For loop will run n times
        for (int topIndex = pancakeArray.length -1; topIndex > 0 ; topIndex--)
        {
            // Find the maximum value's index within the unsorted section of the array
            int maxIndex = 0;
            for (int i = 0; i <= topIndex; ++i)
            {
                if (pancakeArray[i] > pancakeArray[maxIndex])
                    maxIndex = i;
            }
            
            // If maxIndex equals topIndex then the max value in the unsorted section of the array is already in the 
            // correct spot and no flipping is required
            if (maxIndex != topIndex)
            {
                // Put that max value at index 0
                flip(maxIndex);
                // Put that max value into its sorted position
                flip(topIndex);
            }
        }
        return pancakeArray;
    }
}
