public class ProceduralProgram
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

        if (! GCDFunction.validate(value1, value2)) {
            abort("Invalid arguments.");
        }

        int GCD = GCDFunction.calculate(value1, value2);

        System.out.println("The GCD of " + value1 + " and " + value2 + " is " + GCD + ".");
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
