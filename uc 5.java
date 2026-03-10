/**
 * OOPSBannerApp UC5 - OOPS Banner Application (Use Case 5)
 * This class demonstrates inline array initialization with String.join().
 * It combines declaration, initialization, and population into a single 
 * compact statement for improved code conciseness and readability.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // 1. Define and populate the String array in a single inline statement
        // using array literal syntax {} and calling String.join() directly.
        String[] lines = {
            String.join(" ", "  *** ", "  *** ", "****** ", " ***** "),
            String.join(" ", " ** **", " ** **", "** ** ", "** "),
            String.join(" ", "** **", "** **", "** ** ", "** "),
            String.join(" ", "** **", "** **", "****** ", " ***** "),
            String.join(" ", "** **", "** **", "** ", "     **"),
            String.join(" ", " ** **", " ** **", "** ", "     **"),
            String.join(" ", "  *** ", "  *** ", "** ", "***** ")
        };

        // 2. Use an enhanced for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
