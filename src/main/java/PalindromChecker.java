public class PalindromChecker {

    static boolean checkPalindrome(String stringToCheck) {

        int h = stringToCheck.length();
        int k = (h - 1);
        for (int i = 0; i < (stringToCheck.length() / 2); i++) {
            if (stringToCheck.charAt(i) != stringToCheck.charAt(k)) {
                return false;
            }
            k--;
        }
        return true;
    }


}

