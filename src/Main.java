import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("***VOWEL COUNTER***");
        System.out.println("Type a sentence:");
        String sentence = scanner.nextLine();

        for (int i = 0; i<sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
                count ++;
            }

        } System.out.println("Numbers of vowels in this sentence is: " + count);
    }
}