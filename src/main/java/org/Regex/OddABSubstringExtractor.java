package org.Regex;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OddABSubstringExtractor {
    public static void Extraction(Scanner input, PrintWriter output) {
        output.println("Problem 7 - Odd Number of a's and b's Extraction : ");
        String RegEx = "(aa|bb)*(ab|ba)((aa|bb)*(ab|ba)(aa|bb)*(ab|ba))*(aa|bb)*";

        while (input.hasNextLine()) {
            String str = input.nextLine();
            int cout=0;
            if (str.equals("end")) {
                break;
            }else{
                output.println("*"+str+"*");
            }
            Pattern pattern = Pattern.compile(RegEx);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                String match = matcher.group();
                output.println("Matched substring "+(cout+1)+": " + match);
                output.println("Start index: " + matcher.start());
                output.println("End index: " + matcher.end());
                cout++;
            }
            if(cout==0){
                output.println("No matched substrings found");
            }else{
                output.println("Total matched substrings found: "+cout);
            }
        }
        output.println("End of problem 7");
        output.println("--------------------");
    }
}
