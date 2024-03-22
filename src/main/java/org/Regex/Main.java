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
                if (data.equals("1")) {
                    EmailValidator.validate(input, output);
                } else if (data.equals("2")) {
                    PhoneNumberValidator.validate(input, output);
                }
                else if (data.equals("3")) {
                    DateValidator.validate(input,output);
                }else if (data.equals("5")) {
                    CPPValidator.validate(input,output);
                }
                else if(data.equals("8"))
                {
                    WordsMultiple3.validate(input,output);
                }else if(data.equals("10")){
                    MathematicalExpressions.validate(input,output);
                }
            }
            output.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
