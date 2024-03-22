package org.Regex;

import java.io.*;
import java.util.regex.*;
import java.util.*;

public class MathematicalExpressions {
    public static void validate(Scanner input, PrintWriter output) {
        output.println("Problem 10 - Mathematical Expressions Validation:");
        String regex = "^\\(?(\\d{3})\\)?[-\\.\\s]?(\\d{3})[-\\.\\s]?(\\d{4})$";
        while (input.hasNextLine()) {
            String str = input.nextLine();
            if (str.equals("end")) {
                break;
            }
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                output.println("Valid Mathematical Expression");
            } else {
                output.println("Invalid Mathematical Expression");
            }
        }
        output.println("End of problem 10");
        output.println("--------------------");
    }
}