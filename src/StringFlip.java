public class StringFlip {
    public static void main(String[] args) {
        System.out.println(flip("abcdefghijklmnop"));
    }
    private static String flip(String str){
        String newstring = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i<chars.length/2; i++){
            char switch1 = chars[i];
            char switch2 = chars[chars.length-i-1];
            chars[i] = switch2;
            chars[chars.length-i-1] = switch1;
        }
        for (char letter: chars){
            newstring = newstring.concat(String.valueOf(letter));
        }
        return newstring;
    }
}
