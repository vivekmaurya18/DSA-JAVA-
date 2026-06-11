
/*------------------------Naive Approach------------------------------------ */

/* 
class LargestElement {

    public static int largestElement(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = true;

            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                return i;   // index of largest element
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 20, 10};

        System.out.println(largestElement(arr));
    }
}
    
*/

/*---------------------------------Efficient Approach---------------------------------- */


class LargestElement{
    public static int largestElement(int arr[]){
        int max=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={5,8,150,20,103};
        System.out.println(largestElement(arr));
    }
}
