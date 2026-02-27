import java.util.*;
public class Temperature {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temp = sc.nextDouble();
        String Health = (temp>100)? "Fever":"You don't have fever";
        System.out.println(Health);
    }
}
