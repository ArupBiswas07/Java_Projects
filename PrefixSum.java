import java.util.*;
public class PrefixSum {
    public static void maxSumArray(int number[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];

        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=1; j<number.length; j++){
                int end = j;

                curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(maxSum < curSum){
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max sum=" +maxSum);
    }
    public static void main(){
        int number[] = {1, -2, 6, -1, 3};
        maxSumArray(number);
    }
}
