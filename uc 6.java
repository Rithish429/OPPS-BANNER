/**
 * OOPSBannerApp - Modular Version
 * This version uses methods to encapsulate the pattern for each letter.
 * It promotes reusability, modularity, and better maintainability.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Step 2: Call the methods to get the patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 3: Use a loop to assemble and print each line of the "OOPS" banner
        // We use a standard for loop to access the same index across different arrays
        for (int i = 0; i < oPattern.length; i++) {
            // Joins: O + O + P + S for each of the 7 rows
            System.out.println(String.join(" ", 
                oPattern[i], 
                oPattern[i], 
                pPattern[i], 
                sPattern[i]
            ));
        }
    }

    // --- Letter Pattern Methods ---

    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " ** ** ",
            "** **",
            "** **",
            "** **",
            " ** ** ",
            "  *** "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            "****** ",
            "** ** ",
            "** ** ",
            "****** ",
            "** ",
            "** ",
            "** "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "** ",
            "** ",
            " ***** ",
            "     **",
            "     **",
            "***** "
        };
    }
}
