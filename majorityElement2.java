
import java.util.*;

public class majorityElement2 {

    List<Integer> majorityElement(int[] arr) {
        int count1 = 1;
        int count2 = 0;
        int cand1 = 0;
        int cand2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count1 > 0 && arr[i] == cand1) {
                count1++;
            } else if (count2 > 0 && arr[i] == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = arr[i];
                count1=1;
            } else if (count2 == 0) {
                cand2 = arr[i];
                count2=1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cand1) {
                count1++;
            } else if (arr[i] == cand2) {
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();

        if (count1 > arr.length / 3) {
            result.add(cand1);
        }

        if (count2 > arr.length / 3) {
            result.add(cand2);
        }

        return result;

    }

}
