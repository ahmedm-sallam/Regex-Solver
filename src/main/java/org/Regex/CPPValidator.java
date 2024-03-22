package org.Regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPPValidator {
    public static void validate(Scanner input, PrintWriter output) {
        output.println("Problem 5 - CPP Varible  Validation : ");
        String RegEx = "^[a-zA-Z_]\\w*$";
        while (input.hasNextLine()) {
            String str = input.nextLine();
            if (str.equals("end")) break;
            Pattern pattern = Pattern.compile(RegEx);
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                output.println("Valid CPP Variable");
            } else {
                output.println("Invalid CPP variable");
            }
        }
        output.println("End of problem 5");
        output.println("--------------------");
    }
}

