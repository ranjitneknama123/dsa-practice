package arrays;

//A leader number (or leader element) in an array is an element that is greater than
// or equal to all the elements on its right side. The rightmost element of the array
// is always a leader by default because it has no elements to its right.
//Eg:-For example, given the array [16, 17, 4, 3, 5, 2], the leader numbers are
// 17, 5, and 2.
//17 is a leader because it is greater than [4, 3, 5, 2].
//5 is a leader because it is greater than [2].
//2 is a leader because it is the rightmost element.
//YouTube·School of AI
public class FindLearElementInArray {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};

        findLearElementInArray(arr);
    }

    public static void findLearElementInArray(int[] arr) {
        int lastLeaderElement = arr[arr.length - 1];

        System.out.println(lastLeaderElement);

        for (int i = arr.length - 2; i > 0; i--) {
            if (arr[i] > lastLeaderElement) {
                lastLeaderElement = arr[i];
                System.out.println(lastLeaderElement);
            }
        }
    }

}
