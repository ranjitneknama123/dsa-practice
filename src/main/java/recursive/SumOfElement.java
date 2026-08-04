package recursive;

public class SumOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 8};
        int n = arr.length - 1;
        System.out.println("Sum of array elements: " + sumOfArrayElementsOfRecursion(arr, n));
    }

    private static int sumOfArrayElementsOfRecursion(int arr[], int n) {
        if (n == 0) {
            return arr[n];
        } else {
            return sumOfArrayElementsOfRecursion(arr, n - 1) + arr[n];
        }
    }
}
