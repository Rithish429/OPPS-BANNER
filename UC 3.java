/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * * This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enhancing code readability and efficiency
 * by utilizing the String.join() method to create each line of the banner. This approach
 * overcomes the drawbacks of using the + operator for string concatenation, which can lead
 * to code inefficiency due to the creation of multiple intermediate String objects in memory.
 * * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Construct each line using String.join() for better memory efficiency.
        // The first argument " " is the delimiter (space) used between the joined parts.

        // Line 1
        System.out.println(String.join(" ", "  *** ", "  *** ", "****** ", " ***** "));
        
        // Line 2
        System.out.println(String.join(" ", " ** **", " ** **", "** ** ", "** "));
        
        // Line 3
        System.out.println(String.join(" ", "** **", "** **", "** ** ", "** "));
        
        // Line 4
        System.out.println(String.join(" ", "** **", "** **", "****** ", " ***** "));
        
        // Line 5
        System.out.println(String.join(" ", "** **", "** **", "** ", "     **"));
        
        // Line 6
        System.out.println(String.join(" ", " ** **", " ** **", "** ", "     **"));
        
        // Line 7
        System.out.println(String.join(" ", "  *** ", "  *** ", "** ", "***** "));
    }
}
