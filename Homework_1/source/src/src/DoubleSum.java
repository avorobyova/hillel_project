package src;

/**
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 */
public class DoubleSum {

    public static void main(String[] args) {

        System.out.println(DoubleSum.getAdd(10, 3)); // print out result

    }

    public static int getAdd(int a, int b) {
        return a == b ? (a + b) * 2 : a + b;

/*        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }*/
    }

}
