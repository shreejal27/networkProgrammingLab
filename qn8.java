//Write a program to demonstrate the spamcheck 

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class qn8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email message: ");
        String emailMessage = scanner.nextLine();
        scanner.close();

        if (isSpam(emailMessage)) {
            System.out.println("This email may be spam.");
        } else {
            System.out.println("This email is not spam.");
        }
    }

    public static boolean isSpam(String emailMessage) {
        // Common spam patterns to check for
        String[] spamPatterns = {
            "\\b(?:click here|get rich quick|buy now)\\b",
            "\\b(?:urgent|important|immediate action required)\\b",
            "\\b(?:money back guarantee|limited time offer)\\b",
            "\\b(?:free|prize|win|lottery)\\b",
            "\\b(?:viagra|cialis|enhancement)\\b",
            "\\b(?:earn money from home|work from home)\\b"
        };

        for (String pattern : spamPatterns) {
            Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(emailMessage);
            if (m.find()) {
                return true;
            }
        }

        return false;
    }
}