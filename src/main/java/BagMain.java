/* This file contains a few exercises and TODOs for you to fill.
 * Make sure you do the TODOs in Bag.java, HandBag.java and CrossbodyBag.java
 * as the tasks in this file depends on the completion on those!
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
class BagMain {

    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        for (Bag bag: bags){
            bag.enhance();
            if (double_enhance_handbags && bag instanceof HandBag){
                bag.enhance();
            }
        }
    }


    public static int countCrossbodyStraps(Bag[] bags) {
        int i = 0;
        for (Bag bag: bags){
            if (bag instanceof CrossbodyBag){
                i += ((CrossbodyBag) bag).numberOfStraps;
            }
        }
        return i;
    }
}