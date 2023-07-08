package usr.sqrooch.algorithms;

public class BubbleSorting
{
    /**
     * Sorts input array in ascending order.
     *
     * @return array of floating point numbers (type double).
     */
    public double[] sort(double[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            double temp;
            for (int j = arr.length - 1; j >= i; j--)
            {
                if (arr[j - 1] > arr[j])
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
