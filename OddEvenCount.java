import java.util.*;
public class OddEvenCount {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n;
        int number;
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Number of inputs: ");
        n = sc.nextInt();

        System.out.println("Enter the numbers: ");

        for(int i = 1; i<=n; i++){
            number = sc.nextInt();

            if(number % 2==0){
                evenSum += number;
            }
            else{
                oddSum += number;
            }
        }

        System.out.println("Sum of even numbers:" +evenSum);
        System.out.println("sum of odd numbers:" +oddSum);

    }
}
