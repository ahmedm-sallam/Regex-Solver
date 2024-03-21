package org.Regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsMultiple3 {
    public static void validate(File infile, PrintWriter output) throws FileNotFoundException {
        Scanner input = new Scanner(infile);
        output.println("Problem 8 - words whose length ia a multiple of 3: ");
        while (true) {
            String str = input.nextLine();
            if (str.equals("8")) continue;
            if (str.equals("end")) break;
            String RegEx = "\\b([a-zA-Z]{3})+\\b";
            Pattern pattern = Pattern.compile(RegEx);
            Matcher matcher = pattern.matcher(str);
            int count=0;
            List<String> words = new ArrayList<>();
            List<Integer> starts = new ArrayList<>();
            List<Integer> ends = new ArrayList<>();


            while (matcher.find()) {
                count++;
                words.add(matcher.group());
                starts.add(matcher.start());
                ends.add(matcher.end());
            }
            if(count==0)
            {
                output.println("No word matches");
            }
            else
            {

                output.println("number of matched words: " + count);

                for (int i = 0; i < words.size(); i++) {
                    output.println("matched word : " + words.get(i));
                    output.println("start index : " + starts.get(i) + ", end index: " + ends.get(i));
                }

            }
        }
        output.println("End of problem 8");
        output.println("--------------------");}
}
