/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-15
*
*/

import java.util.ArrayList;

/**
* This is the standard "inheritance" program.
*/
public class Throwing {
    /**
    * Arraylist.
    */
    private ArrayList<String> stackAsArray = new ArrayList<String>();

    /**
    * And 1 method.
    *
    * @param decrement
    *
    */
    public void push(final String decrement) {
        this.stackAsArray.add(decrement);
    }

    /**
    * Ahow stack.
    */
    public void showStack() {
        if (stackAsArray.size() == 0) {
            System.out.println("\nIt is empty.\n");
        } else {
            System.out.println("It is start list.");
            for (String iLoop : this.stackAsArray) {
                System.out.println(iLoop);
            }
            System.out.println("It is end list.\n");
        }
    }
}
