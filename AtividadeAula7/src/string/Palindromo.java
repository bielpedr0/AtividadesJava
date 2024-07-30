package string;

public class Palindromo {
    public static void main(String[] args) {
        String s = "Subi no Onibus";
        System.out.println("Palindromo: " + palindromoCheck(s));
    }

    public static boolean palindromoCheck(String s) {
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        for (int i = 0; i < length / 2; i++) {
            if (clean.charAt(i) != clean.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
