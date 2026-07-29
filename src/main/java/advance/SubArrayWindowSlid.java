package advance;

import java.util.ArrayList;
import java.util.List;

//int arr[]={1,2,3,4,5};
//
//Output
//
//Window-1: [1, 2, 3] -> max=> 3, sum=> 6
//Window-2: [2, 3, 4]-> ,max=> 4, sum=> 9
//Window-3: [3, 4, 5]->, max=> 5, sum=> 12
public class SubArrayWindowSlid {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        maxSubArray(arr, 3);

    }

    public static void maxSubArray(int[] arr, int size) {

        List<List<Integer>> subList = new ArrayList<>();
        List<Integer> sumOfSubArray = new ArrayList<>();

        for(int i=0;i<=arr.length-size;i++){
            List<Integer> temp = new ArrayList<>();
            int sum=0;
            for(int j=i;j<i+size;j++){
                temp.add(arr[j]);
                sum+=arr[j];
            }
            subList.add(temp);
            sumOfSubArray.add(sum);
        }
        System.out.println(subList);
        System.out.println(sumOfSubArray);

        int max=0;
        /*sumOfSubArray.forEach(e->{
            System.out.println(e);

        });*/
        for(int i:sumOfSubArray){
            //max=Math.max(max,i);
            if(max<i){
                max=i;
            }
        }
        System.out.println(max);

    }
}
