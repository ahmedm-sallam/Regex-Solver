package org.Regex;

import java.util.*;
import java.util.regex.*;
import java.io.*;

public class EmailValidator {
    public static void validate(File infile, PrintWriter output) throws FileNotFoundException {
        Scanner input = new Scanner(infile);
        output.println("Problem 1 - Email Validation : ");
        while (true) {
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
