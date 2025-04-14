public class Homework8 { // case sensitive
    public boolean check(char[] correctPositions, String word) {
        for (int i = 0; i < correctPositions.length; i++) {
            char character = correctPositions[i];
            if (character == '*') {
                continue;
            } else if (character != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Homework8 hw = new Homework8();

        char[] test1 = { 'W', '*', 'R' };
        String word1 = "WoRdle";
        System.out.println(hw.check(test1, word1));

        char[] test2 = { 'W', '*' };
        String word2 = "wordle";
        System.out.println(hw.check(test2, word2));

        char[] test3 = { 'S', '*', 'G', '*', 'R' };
        String word3 = "SUGAR";
        System.out.println(hw.check(test3, word3));

        char[] test4 = {};
        String word4 = "";
        System.out.println(hw.check(test4, word4));

        char[] test5 = { '*', '*', '*', '*', '*' };
        String word5 = "PARADIGMS";
        System.out.println(hw.check(test5, word5));
    }
}
