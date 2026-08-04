package recursive;

public class SumOfNumbers {

    public static void main(String[] args) {
        int n=6;
        System.out.print("Sum of numbers from 1 to "+n+" is: "+sumOfNumbers(n));
    }

    public static int sumOfNumbers(int n) {
       if(n==0){
           return n;
       }
       return n + sumOfNumbers(n-1);
    }
}
