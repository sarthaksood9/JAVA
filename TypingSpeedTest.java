import java.util.Scanner;

public class TypingSpeedTest {
    public static void main(String[] args) {
        System.out.println("Welcome to the Typing Speed Test!");
        System.out.println("Select an option:");
        System.out.println("1. Type a predefined sentence.");
        System.out.println("2. Type continuously for a specific duration (in seconds).");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                testPredefinedSentence();
                break;
            case 2:
                testContinuousTyping();
                break;
            default:
                System.out.println("Invalid option. Exiting the program.");
        }
    }

    private static void testPredefinedSentence() {
        System.out.println("Type the following sentence and press Enter when you're done:");

        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println(sentence);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        calculateTypingSpeed(sentence, input);
    }

    private static void testContinuousTyping() {
        System.out.println("Enter the duration (in seconds) for the typing test:");
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();

        System.out.println("Start typing. Press Enter when the time is up.");
        Scanner inputScanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        long startTime = System.currentTimeMillis();
        long endTime = startTime + (duration * 1000);

        while (System.currentTimeMillis() < endTime) {
            stringBuilder.append(inputScanner.nextLine());
        }

        String input = stringBuilder.toString();
        calculateTypingSpeed(input, input);
    }

    private static void calculateTypingSpeed(String original, String input) {
        long elapsedTime = System.currentTimeMillis() - startTime;
        double seconds = elapsedTime / 1000.0;
        int numChars = original.length();
        int speed = (int) (numChars / seconds);

        if (input.equals(original)) {
            System.out.println("Congratulations! You typed correctly.");
            System.out.println("Your typing speed: " + speed + " characters per second.");
        } else {
            System.out.println("Oops! You made a mistake while typing.");
        }
    }
}
