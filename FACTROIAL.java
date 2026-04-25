import java.util.*;
class FACTROIAL {
    int fact(int n){
        int result=1;
        for( int i=2 ; i <= n; i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n=sc.nextInt();

        FACTROIAL obj = new FACTROIAL();
        int result = obj.fact(n);
        System.out.println("Factroial NUmber" +result);
    }
}
