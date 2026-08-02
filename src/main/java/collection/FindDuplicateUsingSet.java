package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingSet {
    public static void main(String[] args) {
        String str = "abbbcccddd";
        findDuplicateUsingSet(str);
    }

    private static void findDuplicateUsingSet(String str) {
        char ch[] = str.toCharArray();

        Set<Character> seen = new HashSet<Character>();
        Set<Character> duplicates = new HashSet<Character>();

        for (char c : ch) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
