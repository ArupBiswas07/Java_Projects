import java.util.*;
public class MultiplicationTable {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int multiply=1;

        for(int i=1; i<=10; i++){
            System.out.println(n + "x" + i + "=" + (n*i));
        }

    }
}
