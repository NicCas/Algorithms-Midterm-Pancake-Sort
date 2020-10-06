import java.util.Arrays;

public class PancakeSort
{
    private int[] panArrayCake;

    public PancakeSort(int[] userArray)
    {
        panArrayCake = userArray;
    }

    /* Flips array [0] with array [argument] */
    private void flip (int indexToFlip)
    {
        int temp;
        int start = 0;
        while (start < indexToFlip)
        {
            temp = panArrayCake[start];
            panArrayCake[start] = panArrayCake[indexToFlip];
            panArrayCake[indexToFlip] = temp;

            start++;
            indexToFlip--;
        }
    }

    /* Pancake sort called by user, returns a sorted array */
    public int[] pancakeSort()
    {
        for (int topIndex = panArrayCake.length -1; topIndex > 0 ; topIndex--)
        {
            //System.out.print(".");
            int maxIndex = 0;
            for (int i = 0; i <= topIndex; ++i)
            {
                if (panArrayCake[i] > panArrayCake[maxIndex])
                    maxIndex = i;
            }

            if (maxIndex != topIndex)
            {
                flip(maxIndex);
                flip(topIndex);
            }

            //System.out.println(Arrays.toString(panArrayCake));
        }
        //System.out.println();
        return panArrayCake;
    }
}
