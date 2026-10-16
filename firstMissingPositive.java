import java.util.*;
class firstMissingPositive {
    public static int missingNumber(int[] arr) {
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int num:arr){
            set.add(num);
        }
        int i=1;
        while(set.contains(i)){
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr= {2, -3, 4, 1, 1, 7};
        int result=missingNumber(arr);
        System.out.println(result);
    }
}