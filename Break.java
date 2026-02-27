import java.util.*;
public class Break {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter number:");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
        System.out.println("Series Break");
    }
}
