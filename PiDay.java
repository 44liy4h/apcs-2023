public class PiDay {

    // infinite series for π
    // https://en.wikipedia.org/wiki/Pi#Rate_of_convergence
    // public static double piDay(int n, boolean subtract) {
    // TODO
    // }

    public static void main(String args[]) {
        double pi = calculatePi(500);
        System.out.println("The value of pi is: " + pi);
    }

    /**
     * @param n
     * @return
     */
    public static double calculatePi(int n) {
        if (n == 0) {
            return 4.0;
        } else {
            double term = 4.0 / ((2 * n) + 1);
            if (n % 2 == 0) {
                return calculatePi(n - 1) + term;
            } else {
                return calculatePi(n - 1) - term;
            }
            // Gregory–Leibniz
            // double pi = piDay(1, false);

            // Nilakantha
            // double pi = 3.0 + piDay(3, false);

            // System.out.println("pi = " + pi);
        }
    }

}