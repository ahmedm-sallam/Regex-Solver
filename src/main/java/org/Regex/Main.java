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
                System.out.println(data);
                if (data.equals("1")) {
                    EmailValidator.validate(infile, output);
                } else if (data.equals("2")) {
                    PhoneNumberValidator.validate(infile, output);
                }
//                else if(data.equals("8"))
//                {
//                    WordsMultiple3.validate(infile,output);
//                }
            }
            output.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
