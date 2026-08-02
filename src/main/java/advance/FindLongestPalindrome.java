package advance;

public class FindLongestPalindrome {
    public static void main(String[] args) {
        String str = "abadfdmadamfdfsmalayalam";
        printLongestPlindrome(str);

    }

    private static void printLongestPlindrome(String str) {
        String longStr = "";

        for (int i = 0; i < str.length(); i++) {


            for (int j = i + 1; j <= str.length(); j++) {

                String subStr = str.substring(i, j);

                if (isPalindrome(subStr) && subStr.length() > longStr.length()) {
                    longStr = subStr;
                }
            }
        }
        System.out.println(longStr);
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
