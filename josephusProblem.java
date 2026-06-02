public class josephusProblem {
    public static int josephus(int n , int k){
        if(n==1){
            System.out.println("It's remove itself");
            return 0;
        }
         return (josephus(n-1,k)+k)%n;
    }
    public static void main (String[] args){
        int n=5;
        int k=3;
        System.out.println(josephus(n, k));
    }
    
}
