package String;

import java.util.Arrays;

public class getFrequnecy {
    public static void main(String[] args) {
        String str = "aabbbccz"; // a-z
        int len = str.length();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);

        // Loop through the sorted string to find duplicates
        for (int i = 0; i < len-1; i++) {
            int count = 1;

            // Counting the occurrences of each character
            while (sortedStr.charAt(i)
                          == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }

            // Printing the duplicate character and its
            // count
            if (count > 1) {
                System.out.println(sortedStr.charAt(i)
                                   + ", count = " + count);
            }
        }
    }
}
