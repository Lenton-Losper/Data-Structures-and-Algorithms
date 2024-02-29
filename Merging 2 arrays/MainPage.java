public class MainPage {
    public static void main(String[] args) {
        new Solution();
        int[] test1 = { 1, 2, 3, 4, 5 };
        int[] test2 = { 8, 9, 10, 11, 12 };
        int[] result = Solution.Merge(test1, test2);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
