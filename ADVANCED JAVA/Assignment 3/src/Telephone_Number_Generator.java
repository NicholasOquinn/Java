import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Formatter;


public class Telephone_Number_Generator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a 7-digit number not containing 0, 1:  ");

        try {
            generate(scanner.nextInt());
        }
        catch (Exception IOException) {
            System.err.println("Invalid input. Please try again: ");
        }

    }

    public static void generate(int number) {

        Map<String, String> digit_to_letters = new HashMap<>();
        digit_to_letters.put("2", "ABC");
        digit_to_letters.put("3", "DEF");
        digit_to_letters.put("4", "GHI");
        digit_to_letters.put("5", "JKL");
        digit_to_letters.put("6", "MNO");
        digit_to_letters.put("7", "PRS");
        digit_to_letters.put("8", "TUV");
        digit_to_letters.put("9", "WXY");

        String[] letterArray = new String[7];
        String numberString = String.valueOf(number);


        for (int i = 0; i < 7; i++) {
            letterArray[i] = digit_to_letters.get("" + numberString.charAt(i));
        }

        Formatter output;

        try {
            output = new Formatter("Words.txt");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            for (int m = 0; m < 3; m++) {
                                for (int n = 0; n < 3; n++) {
                                    for (int o = 0; o < 3; o++) {

                                        String generatedWord = "" + letterArray[0].charAt(i)
                                                + letterArray[1].charAt(j) + letterArray[2].charAt(k)
                                                + letterArray[3].charAt(l) + letterArray[4].charAt(m)
                                                + letterArray[5].charAt(n) + letterArray[6].charAt(o) + "\n";

                                        output.format("%s", generatedWord);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            output.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error opening file.");
        }
    }
}

