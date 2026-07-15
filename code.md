ARRAYS – Interview Questions
🔸 Basic to Intermediate
Implement Bubble Sort.


Solve Two Sum using the O(n) approach (HashMap).
import java.util.*;
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // number -> index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // no solution
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}


Find duplicates in an array without using extra space.


Move all zeros to the end (in-place).


Find the second largest element without sorting.


Rotate an array by K steps (in-place, O(1) space).


Find the missing number from 1 to N (XOR approach).


Merge two sorted arrays without using extra space.


Implement Kadane’s Algorithm (Maximum Subarray Sum).


Find the longest consecutive sequence (O(n)).


Product of array except self (without division).



🔸 Advanced / Pattern-Based
Maximum profit in stock buy-sell (all variations).


Subarray with given sum (including negative numbers).


Sliding Window Maximum.


Find all leaders in an integer array.


Find the middle index where left sum = right sum.


Remove duplicate elements from an ArrayList.


Find duplicate number in an integer array.


Find largest and smallest number in an unsorted array.


Rearrange array in alternating positive and negative numbers.



🔸 Recursion / Mathematical
Write a program to find sum of each digit in a number using recursion.



🔹 STRINGS – Interview Questions

🔸 Core String Problems
Reverse a string without using inbuilt methods.


Check if a string is palindrome (O(1) space).


Find first non-repeating character.


Check if two strings are anagrams.


Count frequency of characters.


Remove duplicate characters.


Longest substring without repeating characters.


String compression (aaabb → a3b2).


Check if one string is the rotation of another.


Implement strStr() (substring search).



🔸 Advanced String Problems
Longest Palindromic Substring.


Minimum Window Substring.


KMP Algorithm (Pattern Matching).


Rabin-Karp Algorithm.


Z Algorithm.


Group Anagrams.


Word Break Problem.


Decode String (e.g., 3[a2[c]]).


Generate all permutations of a string.


Edit Distance (Levenshtein Distance).



🔸 Java-Specific / Design Questions
Write a Singleton class in Java.


Reverse and add until you get a palindrome.


Find duplicate words in a given string.


Reverse a string while preserving space positions.


Write a Comparator to compare employees by name, department, and age.
. Write a java program to check whethe palindrome can be formed from character of given string
What is synchronized block and synchronized method
Synchronized method: When you mark a method as synchronized, the entire method is locked.
public synchronized void printNumbers() {
for (int i = 1; i <= 5; i++) {
System.out.println(i);
}
}



Synchronised block: This is used to block parucual peace of code under the method
public void printNumbers() {
synchronized (this) {
for (int i = 1; i <= 5; i++) {
System.out.println(i);
}
}
}
