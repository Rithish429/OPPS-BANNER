/**
 * OOPSBannerApp UC4 - OOPS Banner Application (Use Case 4)
 * This class demonstrates the use of Arrays and Loops to display the banner.
 * It improves upon UC3 by centralizing data in a String array and using 
 * an enhanced for-each loop for printing, reducing code repetition.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // 1. Define a String array with a size equal to the number of lines (7)
        String[] lines = new String[7];

        // 2. Populate each index of the array using String.join()
        // Note: The hint in the image had a typo showing println inside the assignment;
        // we assign the result of String.join directly to the array elements.
        lines[0] = String.join(" ", "  *** ", "  *** ", "****** ", " ***** ");
        lines[1] = String.join(" ", " ** **", " ** **", "** ** ", "** ");
        lines[2] = String.join(" ", "** **", "** **", "** ** ", "** ");
        lines[3] = String.join(" ", "** **", "** **", "****** ", " ***** ");
        lines[4] = String.join(" ", "** **", "** **", "** ", "     **");
        lines[5] = String.join(" ", " ** **", " ** **", "** ", "     **");
        lines[6] = String.join(" ", "  *** ", "  *** ", "** ", "***** ");

        // 3. Use an enhanced for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
