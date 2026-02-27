import java.util.*;
public class Average {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        float average = (float)sum/3;
        System.out.println(average);


    }
}
