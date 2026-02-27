import java.util.*;
public class PositiveNegative {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("The number is Positive");
        }
        else if(a==0){
            System.out.println("The number is neither positive nor negative");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
