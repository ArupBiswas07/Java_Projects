import java.util.*;
public class ItemBill {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float bill = a+b+c;
        float gst = (float)(bill*0.18);
        float FinalBill = bill+gst;
        System.out.println(FinalBill);



    }
}
