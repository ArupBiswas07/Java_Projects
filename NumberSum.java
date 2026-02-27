import java.util.*;
public class NumberSum {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i = 1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum:" +sum);
    }
}
