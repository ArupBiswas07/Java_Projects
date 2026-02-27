import java.util.*;
public class LargestOfThree {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a>=b) && (a>=c)){
            System.out.println("First no. is the largest");
        }
        else if(b>=c){
            System.out.println("Second no. is the largest");
        }
        else{
            System.out.println("Third no. is the largest");
        }

    }
}
