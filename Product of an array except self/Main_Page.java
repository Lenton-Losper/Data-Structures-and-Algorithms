public class Main_Page {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test = { 1, 2, 3, 4 };
        int[] result = solution.prod(test);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}