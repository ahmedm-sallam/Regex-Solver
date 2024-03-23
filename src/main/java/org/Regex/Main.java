package org.Regex;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File infile = new File("input.txt");
            PrintWriter output = new PrintWriter(new FileWriter("output.txt"));
            Scanner input = new Scanner(infile);
            while (input.hasNextLine()) {
                String data = input.nextLine();
                switch (data) {
                    case "1" -> EmailValidator.validate(input, output);
                    case "2" -> PhoneNumberValidator.validate(input, output);
                    case "3" -> DateValidator.validate(input, output);
                    case "4" -> IPValidator.validate(input, output);
                    case "5" -> CPPValidator.validate(input, output);
                    case "6" -> AlphabetValidator.validate(input, output);
                    case "7" -> OddABSubstringExtractor.Extraction(input, output);
                    case "8" -> WordsMultiple3.validate(input, output);
                    case "9" -> ExtractURLs.validate(input, output);
                    case "10" -> MathematicalExpressions.validate(input, output);
                }
            }
            output.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
