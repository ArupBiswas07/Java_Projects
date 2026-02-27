import java.util.*;
public class PassFail {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String result = (marks>=33)?"PASS":"FAIL";
        System.out.println(result);
    }
}
