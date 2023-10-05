
// 3. Check if the input is panagram or not. (Panagram is a sentence that contains all the alphabets from a-z) 
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        scanner.close();

        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }
    }

    public static boolean checkPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26;
    }
}
