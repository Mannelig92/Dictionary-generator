import java.util.*;

public class Main {
    static String speech;

    public static void main(String[] args) {
        aboriginalSpeech();
        splitText(speech);
    }

    public static void aboriginalSpeech() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Абориген говорит: ");
        speech = scanner.nextLine();
    }

    // Фраза аборигена:
    // Привет, человек, как дела, человек, я просто хотел познакомиться с тобой, человек!
    public static void splitText(String speech) {
        Arrays.stream(speech.split(" "))
                .map(value -> value.replaceAll("[^а-яА-Я]", "").toLowerCase(Locale.ROOT))
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
