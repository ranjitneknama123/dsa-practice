package sortings;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int arr[]={1,9,3,6,8,2};
        System.out.println("Before sorting: "+ Arrays.toString(arr));

        divide(arr);
        System.out.println("After sorting: "+Arrays.toString(arr));

    }

    public static void divide(int arr[]){

        int mid=arr.length/2;

        int left[]=new int[mid];
        int right[]=new int[arr.length-mid];

        if(arr.length<2){
            return;
        }

        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }

        for(int i=mid;i<arr.length;i++){
            right[i-mid]=arr[i];
        }



        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));

        divide(left);
        divide(right);

        conquer(arr,left,right);
    }


    public static void conquer(int arr[], int left[], int right[]){

        int i=0,j=0,k=0;

        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }

        while(i<left.length){
            arr[k++]=left[i++];
        }

        while(j<right.length){
            arr[k++]=right[j++];
        }
    }
}
