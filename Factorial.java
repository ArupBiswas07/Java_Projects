import java.util.*;
public class Factorial {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int factorial = 1;

        for(int i=1; i<=n; i++){
            factorial *= i;
        }

        System.out.println("Factorial:" +factorial);
    }
}
