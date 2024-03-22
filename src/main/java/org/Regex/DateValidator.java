package org.Regex;

import java.io.*;
import java.util.*;
import java.util.regex.*;
public class DateValidator {
    public static void validate(Scanner input, PrintWriter output)  {
        output.println("Problem 3 - Date Validation : ");
        String RegEx = "((\\d{4})-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01]))|((\\d{4})/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01]))|((0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-(\\d{4}))|((0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(\\d{4}))";
        while (input.hasNextLine()) {
            String str = input.nextLine();
            if (str.equals("3")) continue;
            if (str.equals("end")) break;
            Pattern pattern = Pattern.compile(RegEx);
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                output.println("Valid Date");
            } else {
                output.println("Invalid Date");
            }
        }
        output.println("End of problem 3 ");
        output.println("--------------------");

    }
}
