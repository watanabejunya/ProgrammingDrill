public class ObjectOrientedProgram
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

        GCD GCDCalulator = new GCD(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        int value1 = GCDCalulator.getValue1();
        int value2 = GCDCalulator.getValue2();
        int GCD = GCDCalulator.getGCD();

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
