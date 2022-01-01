/*
* This program uses the HaokaiStack class
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

/**
* This is the standard "lock" program.
*/
final class FlyTest {
    /**
    * The first number.
    */
    private static final int TWOONETWO = 212;

    /**
    * The second number.
    */
    private static final int FOURTWOTWO = 422;

    /**
    * The third number.
    */
    private static final int FIVEOOO = 5000;

    /**
    * The fourth number.
    */
    private static final int FOUR = 4;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private FlyTest() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Airplane biplane = new Airplane();
        biplane.setSpeed(TWOONETWO);
        System.out.println(biplane.getSpeed());
        final Jet boeing = new Jet();
        boeing.setSpeed(FOURTWOTWO);
        System.out.println(boeing.getSpeed());
        int xLoop = 0;
        while (xLoop < FOUR) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > FIVEOOO) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            xLoop++;
        }
        System.out.println(biplane.getSpeed());
        System.out.println("\nDone.");
    }
}
