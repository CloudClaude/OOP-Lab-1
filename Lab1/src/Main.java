//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    static String vowels = "аеёиоуыэюя";
    static String consonants = "бвгджзйклмнпрстфхцчшщъь";
    static Integer countvowels = 0;
    static Integer countconsonants = 0;
    Integer countsentences = 0;
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); 
        return vowels.indexOf(c) != -1;
    }

    public static boolean isConsonant(char c) {
        c = Character.toLowerCase(c); 
        return consonants.indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        String[] sentences = text.split("[.!?]");

        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i].trim();
            if (sentence.isEmpty()) continue;
            for (char c : sentence.toCharArray()) {
                if (isVowel(c)) {
                    countvowels++;
                } else if (isConsonant(c)) {
                    countconsonants++;
                }
            }
            System.out.println("Предложение: \"" + sentence + "\"");
            System.out.println("Гласных: " + countvowels + ", Согласных: " + countconsonants);

            if (countvowels > countconsonants) {
                System.out.println("Гласных больше.");
            } else if (countconsonants > countvowels) {
                System.out.println("Согласных больше.");
            } else {
                System.out.println("Гласных и согласных поровну.");
            }
        }

    }
}
