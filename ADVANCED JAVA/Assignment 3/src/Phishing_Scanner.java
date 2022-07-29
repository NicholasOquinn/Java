import java.io.File;
import java.util.Scanner;

public class Phishing_Scanner {

    private static final String[] suspiciousWords = { "Account", "Password", "Login", "User", "Money",
    "Address", "Email", "Access", "Reward", "Offer", "Exclusive", "Activity", "Threat",
    "Suspicious", "Risk", "Immediate", "Click", "Here", "Link", "Paid", "Fast", "Earn", "Deal", "Deposit",
    "Sign-up", "Free", "Opportunity", "Now", "Security", "Personal"};

    private static final int[] WordPoints = { 4, 5, 5, 2, 2, 3, 2, 3, 2, 2,
            1, 1, 3, 2, 3, 2, 3, 1, 3, 1, 1, 2, 2, 4, 4, 2, 1, 1, 2, 2 };



    public static void main(String[] args) throws Exception {

        Scanner file = new Scanner(new File("PhishingEmailExample.txt"));

        file.useDelimiter("[^A-Za-z]+");
        int arraySize = suspiciousWords.length;
        int[] pointTracker = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
            pointTracker[i] = 0;

        while (file.hasNext()) {
            String word = file.next();

            for (int i = 0; i < arraySize; i++)
                if (word.equalsIgnoreCase(suspiciousWords[i]))
                    pointTracker[i]++;
        }

        System.out.println("\nPhishing Word\t\tCount\tPoints");
        System.out.println("-----------------------------------");
        int totalPoints = 0;
        for (int i = 0; i < arraySize; i++) {
            if (pointTracker[i] > 0) {
                System.out.printf("%-15s %8d %8d\n", suspiciousWords[i],
                        pointTracker[i], WordPoints[i]);
                totalPoints += WordPoints[i] * pointTracker[i];
            }
        }
        System.out.println("\nTotal points: " + totalPoints);
        file.close();
    }
}


