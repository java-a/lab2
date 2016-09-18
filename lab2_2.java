/**
 * This class is to verify the equation
 *      lim (1 + 1/n)^n = e     (n->+oo)
 * Please feel free to contact your TAs.
 * */

public class lab2_2 {
    public static void main(String[] args) {
        double n = 10;
        double right = Math.E;
        double left = 0;
        // Please change the value of "left".
        // Write your code here.


        if (Math.abs(right - left) < 1e-2)
            System.out.println("Congratulations! You have finished the equation verification.");
    }
}
