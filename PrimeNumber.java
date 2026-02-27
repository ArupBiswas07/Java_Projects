import java.util.*;
public class PrimeNumber {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2){
            System.out.println("Number is Prime");
        }
        else{
        boolean isPrime = true;
        for (int i=2; i<=n-1; i++){  // we can also write i<= Maths.sqrt(n)
            if (n%i ==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("Number is not Prime");
        }
        }
    }
}
