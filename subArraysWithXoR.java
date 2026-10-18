
import java.util.HashMap;

/*
// Brute Force

class subArraysWithXoR{
    public static int XoR(int[] arr, int k){
        int count=0;
        int n=arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                int xor=0;
                for ( k = i; k <= j; k++) {
                    xor=xor^arr[k];                
                }
                if(xor==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
        int k=6;
        int result=XoR(arr, k);

        System.out.println(result);

    }
}


=====================>Better Approach<==========================

class subArraysWithXoR{
    public static int XoR(int[] arr, int k){
        int count=0;
        int n=arr.length;

        for (int i = 0; i < n; i++) {
            int xor=0;
            for (int j = i; j < n; j++) {
                    xor=xor^arr[j];                
                if(xor==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr={4,2,2,6,4};

        int k=6;

        int result=XoR(arr, k);

        System.out.println(result);
    }
}

*/



class subArraysWithXoR{
    public static int XoR(int[] arr, int k){
        HashMap<Integer,Integer>map=new HashMap<>();

        map.put(0,1);
        int count=0;
        int n=arr.length;
        int xor=0;

        for (int i = 0; i < n; i++) {
            xor=xor^arr[i];

            int required=xor^k;
            count+=map.getOrDefault(required,0);

            map.put(xor,map.getOrDefault(required,0)+1);
            }
        return count;
    }
    public static void main(String[] args) {

        int[] arr={4,2,2,6,4};

        int k=6;

        int result=XoR(arr, k);

        System.out.println(result);
    }
}