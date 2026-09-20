public class nextPermutation {
    public static void nextPermutation(int[] arr){

        int n=arr.length;
        int i=n-2;
        
        for(;i>=0;i--){
            if(arr[i]<arr[i+1]){
                break;
            }
        }
        if(i>=0){

            int j=n-1;

            for (; j>i; j--) {
                if(arr[j]>arr[i]){
                    break;
                }    
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;  
        }  
        int left = i + 1;
        int right = n - 1;

        for (; left < right; left++, right--) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,1, 5, 4, 3,0, 0};

        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }
    }
}
