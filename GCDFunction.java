public class GCDFunction
{
    /**
     * Validate input values.
     *
     * @param  int value1
     * @param  int value2
     * @return int
     */
    public static boolean validate(final int value1, final int value2)
    {
        return value1 >= 1 && value2 >= 1 && value1 >= value2;
    }

    /**
     * Run Euclidean algorithm and return the GCD.
     *
     * @param  int value1
     * @param  int value2
     * @return int
     */
    public static int calculate(final int value1, final int value2)
    {
        int temp1 = value1;
        int temp2 = value2;
        int surplus;

        do {
            surplus = temp1 % temp2;

            temp1 = temp2;
            temp2 = surplus;
        } while (surplus != 0);

        return temp1;
    }
}
