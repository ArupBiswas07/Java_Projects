import java.util.*;
public class OddEven {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
