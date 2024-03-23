package org.Regex;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphabetValidator {
    public static void validate(Scanner input, PrintWriter output) {
        output.println("Problem 6 - Alphabet Addresses Validation : ");
        String RegEx = "(?i)(?!.*(bBb|BBB|bbb))\\b.*\\b";
        /*
        (?i) - This part makes the regex case-insensitive.
        (?!.*(bBb|BBB|bbb)) - Negative lookahead assertion to ensure that there are no cases of "bBb", "BBB", or "bbb" anywhere in the string.
          \\b.*\\b - This part matches any string surrounded by word boundaries, effectively matching the whole input string.
         */
        Pattern pattern = Pattern.compile(RegEx);
        while (input.hasNextLine()) {
            String str = input.nextLine();
            if (str.equals("end")) {
                break;
            }
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                output.println("Valid String");
            } else {
                output.println("invalid string, has 3 consecutive b's");
            }
        }
        output.println("End of problem 6");
        output.println("--------------------");
    }
}
