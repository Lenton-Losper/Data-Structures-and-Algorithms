public class Solution {
    public boolean Palindrome(String a) {
        // String a = " Plane"
        // the reverse has to == Plane to be true
        a = a.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        int left = 0;

        int right = a.length() - 1;

        while (left <= right) {
            if (a.charAt(left) != a.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

}
