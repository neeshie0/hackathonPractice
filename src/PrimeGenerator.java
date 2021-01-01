import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        String nums = "";
        for (int i = 0; i < times; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            for (int r = num1; r <= num2; r++) {
                if (isPrime(r)) {
                    nums = nums.concat(r + "\n");
                }
            }
            nums = nums.concat("\n");
        }
        System.out.println(nums);
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
