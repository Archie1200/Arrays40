import java.util.Arrays;
import java.util.HashSet;
//doubt
public class LongestConsecutiveSubse {
    public static void main(String[] args) {
        int arr[] = {21,44,34,12,35,70,98,36,37,55,38,39,23,40,22,41,100,99,57,78};
        check(arr);
    }

    public static void check(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) {
                int j = arr[i];
                while (set.contains(j)) {
                    j++;
                }
                if (p < j - arr[i]) {
                    p = j - arr[i];
                }
            }
        }
            System.out.println(p);

    }
}
