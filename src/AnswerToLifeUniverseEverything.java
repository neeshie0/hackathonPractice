import java.util.Scanner;

public class AnswerToLifeUniverseEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String beforeNum = "";
        String current = scanner.next();
        while (!current.equals("42")){
            beforeNum = beforeNum.concat(current + "\n");
            current = scanner.next();
        }
        System.out.println(beforeNum);

    }
}
