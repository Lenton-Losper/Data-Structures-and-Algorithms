
public class Solution {
    public static int[] Merge(int[] arr1, int[] arr2) {
        int k = arr1.length;
        int s = arr2.length;

        int t = s + k;

        int[] sc = new int[k + s];
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] < arr2[i]) {
                sc[i] = arr1[i];
            } else if (arr2[i] < arr1[i]) {
                sc[i] = arr2[i];
            }

        }
        return sc;
    }
}
