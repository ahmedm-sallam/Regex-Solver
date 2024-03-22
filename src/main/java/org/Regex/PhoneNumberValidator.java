package org.Regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static void validate(Scanner input, PrintWriter output) throws FileNotFoundException {
        output.println("Problem 2 - Phone Number Validation : ");
        String RegEx =  "^\\(?(\\d{3})\\)?[-.\\s]?(\\d{3})[-.\\s]?(\\d{4})$";
        while (input.hasNextLine()) {
            String str = input.nextLine();
            if (str.equals("2")) continue;
            if (str.equals("end")) break;
            Pattern pattern = Pattern.compile(RegEx);
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                output.println("Valid Phone Number");
            } else {
                output.println("Invalid Phone Number");
            }
        }
        output.println("End of problem 2");
        output.println("--------------------");
    }
}
