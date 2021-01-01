import java.util.Scanner;

public class NextPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();
        System.out.println(nextPalindrome(num.toString()));
    }

    private static String nextPalindrome(String num) {
        if (!isPalindrome(num.toCharArray())) {
            if (num.length() % 2 == 0) {
                char[] digits = num.toCharArray();
                char[] firstHalf = new char[digits.length / 2];
                char[] secondHalf = new char[digits.length / 2];
                for (int i = 0; i < digits.length / 2; i++) {
                    firstHalf[i] = digits[i];
                    secondHalf[i] = digits[digits.length / 2 - i - 1];
                }
                if (digits[firstHalf.length] > secondHalf[0]) {
                    secondHalf[0] = digits[firstHalf.length];
                } else {

                }
                String str = "";
                for (int i = 0; i < secondHalf.length; i++) {
                    str = str.concat(String.valueOf(firstHalf[i]));
                }
                for (int i = 0; i < secondHalf.length; i++) {
                    str = str.concat(String.valueOf(secondHalf[i]));
                }
                return str;
            } else {
                char[] digits = num.toCharArray();
                char[] firstHalf = new char[digits.length / 2];
                char[] secondHalf = new char[digits.length / 2];
                for (int i = 0; i < digits.length / 2; i++) {
                    firstHalf[i] = digits[i];
                    secondHalf[i] = digits[digits.length / 2 - i - 1];
                }
                String str = "";
                for (int i = 0; i < secondHalf.length; i++) {
                    str = str.concat(String.valueOf(firstHalf[i]));
                }
                if (firstHalf[firstHalf.length - 1] > secondHalf[0]) {
                    secondHalf[0] = firstHalf[firstHalf.length - 1];
                } else {
                    str = str.concat(String.valueOf(Integer.parseInt(String.valueOf(digits[digits.length / 2])) + 1));
                }
                for (int i = 0; i < secondHalf.length; i++) {
                    str = str.concat(String.valueOf(secondHalf[i]));
                }
                return str;
            }
        }
        else {

        }
        return "";
    }

    private static boolean isPalindrome(char[] str) {
        for (int i = 0; i < str.length / 2 + 1; i++) {
            if (str[i] != str[str.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
