/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * Relevant xkcd.
 * https://xkcd.com/1513/
 */
public class ReclamationProject {
    /**
     * Returns the longest matching substring of the two parameters.
     * @param a first paramter
     * @param b second parameter
     * @return string that has been processed
     */
    static String doIt(final String a, final String b) {
        String first = a;
        String second = b;
        if (a.length() > b.length()) {
            first = b;
            second = a;
        }
        String r = "";
        for (int i = 0; i < first.length(); i++) {
            for (int j = first.length() - i; j > 0; j--) {
                for (int k = 0; k <= second.length() - j; k++) {
                    if (first.regionMatches(i, second, k, j) && j > r.length()) {
                        r = first.substring(i, i + j);
                    }
                }
            }
        } return r;
    }

    /**
     * Testing cuz idk what the other thing does.
     * @param args does a thing
     */
    public static void main(final String[] args) {
        System.out.println(doIt("histesting", "hiftesting"));
    }
}
