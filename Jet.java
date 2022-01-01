/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

/**
* This is the standard "lock" program.
*/
public class Jet extends Airplane {
    /**
    * Multiplier.
    */
    private static final int MULTIPLIER = 2;

    /**
    * Set speed.
    *
    * @param speed Speed
    *
    */
    public void setSpeed(final int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
    * Get speed.
    */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }
}
