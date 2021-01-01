import java.util.Scanner;
import java.util.Stack;

public class ExpressionTransform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int num = scanner.nextInt();
        for (int i = 0; i<num; i++){
            String str = scanner.next();
            answer = answer.concat(reverse(str)+"\n");
        }
        System.out.println(answer);
    }

    private static String reverse(String exp) {
        String reverse = "";
        Stack stack = new Stack();
        for (Object item : exp.toCharArray()) {
            stack.push(item);
            if (item.equals(')')){
                stack.pop();
                String thing2 =  String.valueOf(stack.pop());
                String operator =  String.valueOf(stack.pop());
                String thing1 =  String.valueOf(stack.pop());
                stack.pop();
                stack.push(thing1+thing2+operator);
            }
        }
        return (String) stack.pop();
    }

}

