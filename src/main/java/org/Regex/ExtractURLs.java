package org.Regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractURLs {
    public static void validate(Scanner input, PrintWriter output) throws FileNotFoundException {
        output.println("Problem 9 -  extract URLs from a text file: ");
        while (input.hasNextLine()) {
            String str = input.nextLine();
            if (str.equals("9")) continue;
            if (str.equals("end")) break;
            String rg = "((https|http)?://[\\w\\.-]+[:\\d]*(/([\\w\\./]*(\\?(\\S)+)?(#(\\S)+)?)?)?)\\b/?";
            Pattern pattern = Pattern.compile(rg);
            try {
                File infile = new File(str);
                Scanner inputProblem9 = new Scanner(infile);
                output.println("Input file name: "+str);

                int lineCount = 0;
                int urlsCount = 0;

                ArrayList<ArrayList<String>> urls = new ArrayList<>();
                ArrayList<ArrayList<Integer>> starts = new ArrayList<>();
                ArrayList<ArrayList<Integer>> ends = new ArrayList<>();

                while (inputProblem9.hasNextLine()) {
                    lineCount++;
                    String line = inputProblem9.nextLine();
                    Matcher matcher = pattern.matcher(line);

                    // Initialize the second dimension
                    urls.add(new ArrayList<>());
                    starts.add(new ArrayList<>());
                    ends.add(new ArrayList<>());

                    while (matcher.find()) {
                        urlsCount++;
                        urls.get(lineCount - 1).add(matcher.group());
                        starts.get(lineCount - 1).add(matcher.start());
                        ends.get(lineCount - 1).add(matcher.end());
                    }
                }

                output.println("Number of URLs: " + urlsCount);

                // Print the urls, starts, and ends lists
                for (int i = 0; i < urls.size(); i++) {
                    ArrayList<String> urlList = urls.get(i);
                    ArrayList<Integer> startList = starts.get(i);
                    ArrayList<Integer> endList = ends.get(i);
                    for (int j = 0; j < urlList.size(); j++) {
                        output.println("URL: " + urlList.get(j));
                        output.println("Line: " + (i + 1));
                        output.println("start index: " + startList.get(j) + ", end index: " + endList.get(j));
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }
        output.println("End of problem 9");
        output.println("--------------------");}
}
