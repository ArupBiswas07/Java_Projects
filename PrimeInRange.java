public class PrimeInRange {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){ // for(int i=2; i<=Math.sqrt(n); i++)
            if(n % i == 0){
                isPrime= false; // return false;
            }
        }
        return isPrime; // return true;
    }

    public static void PrimesinRange(int n){
        for(int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(){
        PrimesinRange(20);
    }
}
