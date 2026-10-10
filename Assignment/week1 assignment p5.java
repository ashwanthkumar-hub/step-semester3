import java.util.Scanner;

public class Main {

    static void classifyWordLengths(String review) {
        String[] words = review.trim().split("\\s+");

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {
            if (word.isEmpty())
                continue;

            int length = word.replaceAll("[^a-zA-Z0-9]", "").length();

            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length >= 5 && length <= 8) {
                mediumCount++;
            } else if (length >= 9) {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount
                + " | Medium: " + mediumCount
                + " | Long: " + longCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie review:");
        String review = sc.nextLine();

        classifyWordLengths(review);

        sc.close();
    }
}