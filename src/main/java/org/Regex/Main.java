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
                    case "1":
                        EmailValidator.validate(infile, output);
                        break;
                    case "2":
                }
            }
            output.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
