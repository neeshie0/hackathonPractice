import java.util.Scanner;

public class TreeSkiing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int north = 0;
        for (int i = 0; i < num; i++) {
            if (reader.next().toCharArray()[0] == 'N') {
                north++;
            }
        }
        System.out.println((factorial(num) / (factorial(north) * factorial(num - north))) - 1);


    }

    public static int factorial(int num) {
        int factorial = 1;
        while (num > 1) {
            factorial *= num;
            num--;
        }
        return factorial;
    }
}