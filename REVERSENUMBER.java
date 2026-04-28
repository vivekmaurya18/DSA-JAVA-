import java.util.*;

class REVERSENUMBER {
    boolean ispalindrome(int n){
        int rev =0;
        int temp=n;
        while(n>0){
            int lastdigit = n % 10;
            rev=rev*10+lastdigit;
            n=n/10;
        }
        return (rev == temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n = sc.nextInt();


        REVERSENUMBER obj = new REVERSENUMBER();
        boolean result = obj.ispalindrome(n);
        
        if(result){
            System.err.println("Is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
