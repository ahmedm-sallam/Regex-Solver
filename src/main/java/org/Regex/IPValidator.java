package org.Regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidator {
    public static void validate(Scanner input, PrintWriter output) {
        output.println("Problem 4 - IP Addresses Validation : ");
        String RegEx = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
        while (input.hasNextLine()) {
            String str = input.nextLine();
            if (str.equals("end")) break;
            Pattern pattern = Pattern.compile(RegEx);
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                output.println("Valid IP Address");
            } else {
                output.println("Invalid IP Address");
            }
        }
        output.println("End of problem 4");
        output.println("--------------------");
    }
}
