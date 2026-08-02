package advance;

public class Equilibrium {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 0, 1, 5, 0, 5, 6, 5};
        findEquilibrium(arr);

    }

    public static void findEquilibrium(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int leftSum = 0, rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                System.out.println("Equilibrium found at index: " + i + " and element is " + arr[i]);
            }
        }


    }

}
