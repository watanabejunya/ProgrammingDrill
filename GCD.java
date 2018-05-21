public class GCD
{
    /* Values for Euclidean algorithm. */
    private final int value1;
    private final int value2;

    /* The GCD of the values. */
    private int GCD = 0;

    /**
     * Constructor.
     *
     * @param int value1
     * @param int value2
     */
    GCD(final int value1, final int value2)
    {
        if (! this.validate(value1, value2)) {
            System.out.println("Invalid arguments.");
            System.exit(1);
        }

        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * Validate input values.
     *
     * @param  int value1
     * @param  int value2
     * @return boolean
     */
    private boolean validate(final int value1, final int value2)
    {
        return value1 >= 1 && value2 >= 1 && value1 >= value2;
    }

    /**
     * Get value1.
     *
     * @return int
     */
    public int getValue1()
    {
        return this.value1;
    }

    /**
     * Get value2.
     *
     * @return int
     */
    public int getValue2()
    {
        return this.value2;
    }

    /**
     * Get the GCD.
     *
     * @return int
     */
    public int getGCD()
    {
        if (this.GCD < 1) {
            this.GCD = this.calculate();
        }

        return this.GCD;
    }

    /**
     * Run Euclidean algorithm and return the GCD.
     *
     * @return int
     */
    private int calculate()
    {
        int temp1 = this.value1;
        int temp2 = this.value2;
        int surplus;

        do {
            surplus = temp1 % temp2;

            temp1 = temp2;
            temp2 = surplus;
        } while (surplus != 0);

        return temp1;
    }
}
