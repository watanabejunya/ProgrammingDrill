public class StructuredProgram
{
    /**
     * Handle input and start the program.
     *
     * @param String[] args
     */
    public static void main(String[] args)
    {
        if (args.length != 2) {
            abort("Too few arguments.");
        }

        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);

        if (! validate(value1, value2)) {
            abort("Invalid arguments.");
        }

        int GCD = calculate(value1, value2);

        System.out.println("The GCD of " + value1 + " and " + value2 + " is " + GCD + ".");
    }

    /**
     * Validate input values.
     *
     * @param  int value1
     * @param  int value2
     * @return
     */
    private static boolean validate(final int value1, final int value2)
    {
        return value1 >= 1 && value2 >= 1 && value1 >= value2;
    }

    /**
     * Run Euclidean algorithm and return the result.
     *
     * @param  int value1
     * @param  int value2
     * @return
     */
    private static int calculate(final int value1, final int value2)
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

    /**
     * Abort the program with message.
     *
     * @param String message
     */
    private static void abort(String message)
    {
        System.out.println(message);
        System.exit(1);
    }
}
