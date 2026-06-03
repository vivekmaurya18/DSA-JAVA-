import java.util.Scanner;

public class subsetsSumProblem {
    public static int countSubsets(int arr[],int n,int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return countSubsets(arr,n-1,sum)+countSubsets(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter Array Elements");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter Sum of Subsets");
        int sum=sc.nextInt();

        System.out.println("Output Of Subnets Is " + countSubsets(arr, n, sum));
    }
    
}
