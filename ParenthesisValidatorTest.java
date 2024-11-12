//Written by: Affan Thameem (40282375) 
//Class: COMP 352 Fall 2024
//COMP 352 Programming A2
//Due Date: Monday, November 4th 2024

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParenthesisValidatorTest {

    public static void main(String[] args) {
        ParenthesisValidator validator = new ParenthesisValidator();
        String fileName = "PA2_TestFile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String trimmedLine = line.trim();
                if (trimmedLine.isEmpty()) continue;

                boolean isValid = validator.isValid(trimmedLine);
                if (isValid) {
                    System.out.println(trimmedLine + " - Valid");
                } else {
                    System.out.println(trimmedLine + " - Invalid");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}