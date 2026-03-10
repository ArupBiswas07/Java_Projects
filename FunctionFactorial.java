public class FunctionFactorial {
    public static int factorial(int n){
        int f=1;

        for (int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(){
        int a = 5;
        int fact = factorial(a);
        System.out.println("Factorial: " +fact);
    }
}
