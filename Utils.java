/**
* this class represents a utlity program which finds and replaces an array of 
* strings with another array of strings. 
* <p>
* @author skovv064@uottawa.ca
*/
public class Utils {
     /**
     * Returns a copy of the array 'in' where each word occurring in the array
     * 'what' has been replaced by the word occurring in the same position
     * in the array 'with'.
     *
     * @param in an array of Strings;
     * @param what an array of words to be replaced;
     * @param with an array of replacement words;
     * @return a new array idententical to 'in' except that all the occurrences of words
     * found in 'what' have been replaced by the corresponding word from 'with'.
     */
    public static String[] findAndReplace(final String[] in, final String[] what, final String[] with) {
        if (in == null || what == null || with == null
                || what.length != with.length) {
            return null;
        }
        final String[] out = in.clone();
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < what.length; j++) {
                if (out[i] == null || what[j] == null || with[j] == null) {
                    return null;
                }
                if (out[i].equals(what[j])) {
                    out[i] = with[j];
                    break;
                }
            }
        }
        return out;
    }

}