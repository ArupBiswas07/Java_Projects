import java.util.*;
public class MaxSubarraySum {
    public static void maxSum(int number[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                curSum = 0;
                for(int k=start; k<=end; k++){
                    curSum += number[k];
                }
                System.out.println(curSum);
                if(maxSum < curSum){
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max sum=" +maxSum);
    }

    public static void main(){
        int number[] ={1, -2, 6, -1, 3};
        maxSum(number);
    }
}
