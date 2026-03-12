public class FunctionAverage {
    public static int average(int a, int b, int c){
        int sum = a+b+c;
        int result = sum/3;
        return result;
    }

    public static void main(){
        System.out.println(average(2,3,4));
    }

}
