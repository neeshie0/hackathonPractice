import java.util.Scanner;

public class NumReduction {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int count = 0;
        while (num != 1) {
            if (num % 2 != 0) {
                num = 2 * num + 1 + num;
            } else {
                num = num / 2;

            }
            count++;
        }
        System.out.println(count);
    }
}
