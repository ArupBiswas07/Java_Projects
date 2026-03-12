public class FunctionSumDigits {
    public static int sumDigits(int n){
        int integer = n;
        int sum = 0;

        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n/10;
        }
        return sum;
    }
    public static void main(){
        System.out.println(sumDigits(93));
    }
}
