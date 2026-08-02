package sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,9,8};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        bsort(arr);

    }

    public static void bsort(int arr[]){
        boolean flag = true;
        int outerLoop=0, innerLoop=0;

        for(int i=0;i<arr.length;i++){
            outerLoop+=1;

            for(int j=0;j<arr.length-1-i;j++){
                innerLoop+=1;

                if(arr[j]>arr[j+1]){
                    flag=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            if(flag){
                System.out.println("Array is already sorted");
                break;
            }
        }
        System.out.println("innerLoop: " + innerLoop);
        System.out.println("outerLoop: " + outerLoop);

        System.out.println("Total no of times loops iterates: " + innerLoop * outerLoop);

        System.out.println(Arrays.toString(arr));
    }
}
