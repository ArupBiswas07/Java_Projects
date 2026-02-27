import java.util.*;
public class nNumber {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.println(counter+ " ");
            counter++;
        }
        System.out.println();
    }
}
