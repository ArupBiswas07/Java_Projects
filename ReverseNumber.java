import java.util.*;
public class ReverseNumber {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        while(n>0){
            int lastdigit = n%10;
            System.out.println(lastdigit + " ");
            n = n/10;
        }
        System.out.println();
    }
}
