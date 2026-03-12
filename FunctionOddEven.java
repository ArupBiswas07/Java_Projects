public class FunctionOddEven {
    public static boolean isEven(int n){
        while(n > 0){
            boolean isEven = true;
            if(n % 2 != 0){
                return false;
            }
            else{
                return true;
            }
        }
        return false;

    }

    public static void main(){
        System.out.println(isEven(9));
    }
}
