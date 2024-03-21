package org.Regex;

import java.util.*;
import java.util.regex.*;
import java.io.*;

public class EmailValidator {
    public static void validate(Scanner input, PrintWriter output) throws FileNotFoundException {
        output.println("Problem 1 - Email Validation : ");
        while (input.hasNextLine()) {
            String str = input.nextLine();
            if (str.equals("1")) continue;
            if (str.equals("end")) break;
            String RegEx = "[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}";
            Pattern pattern = Pattern.compile(RegEx);
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                output.println("Valid email");
            } else {
                output.println("Invalid email");
            }
        }
        output.println("End of problem 1");
        output.println("--------------------");}
}
