package advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangePositiveNegative {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,-1,-2,-3,-4,-5};
        //1,-1,2,-2,3,-3,4,-4(arr);
        rearranegList(arr);
    }

    public static void rearranegList(int arr[]){
        List<Integer> positiveList=new ArrayList<>();
        List<Integer> negativeList=new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(arr[i]>0){
                positiveList.add(arr[i]);
            }
            else{
                negativeList.add(arr[i]);
            }
        }

        System.out.println(positiveList);
        System.out.println(negativeList);
        conquer(arr,positiveList,negativeList);
    }

    public static void conquer(int arr[],List<Integer> positiveList, List<Integer> negativeList){

        int i=0,j=0,k=0;
        while(i<positiveList.size() && j<negativeList.size()){

            arr[k]=positiveList.get(i);
            i++;
            k++;

            arr[k]=negativeList.get(j);
            j++;
            k++;
        }

        while(i<positiveList.size()){
            arr[k]=positiveList.get(i);
            i++;
            k++;
        }

        while(j<negativeList.size()){
            arr[k]=negativeList.get(j);
            j++;
            k++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
