package arrays;

//The pattern in your comment represents counting the number of elements between
// an item and its next identical occurrence in the array.
public class FindIndexBetweenArray {

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 6, 8, 1, 6, 3, 1};
        // [1=4; 3=5; 4=0; 6=2; 8=0; 1=2; 6=0; 3=0; 1=0]
        countIndexBetweenRepeating(arr);

    }

    public static void countIndexBetweenRepeating(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count=j-i-1;
                    break;
                }
            }
            if(count>0){
                System.out.println(arr[i]+" "+count);
            }
            else {
                System.out.println(arr[i]+" "+count);
            }
        }
    }

}
