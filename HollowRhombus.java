public class HollowRhombus {
    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //hollow rectangle
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
                // the hollow rectangle automatically gets tilted when the spaces are printed at first
            }
            System.out.println();
        }
    }

    public static void main(){
        hollowRhombus(5);
    }
}
