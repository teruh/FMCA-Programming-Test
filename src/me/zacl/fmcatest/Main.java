package me.zacl.fmcatest;

import me.zacl.fmcatest.util.FileProcessor;
import me.zacl.fmcatest.util.PalindromeChecker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Entry point for the program.
 * 10-12-2021
 *
 * @author Zachary Clark
 */
public class Main {
   public static void main(String[] args) {
      // Stores strings from file that we'll be checking for palindromes
      List<String> stringsToCheck;

      // Stores the final list of palindromes
      List<String> palindromes = new ArrayList<>();

      try {
         // Read provided words.txt and save the contents to a list for testing
         stringsToCheck = FileProcessor.fileToList("words.txt");

         // Check each string in the List for a palindrome, and if it is, add it to the list of
         // Palindromes.
         for (String string : stringsToCheck) {
            if (PalindromeChecker.isPalindrome(string)) {
               palindromes.add(string);
            }
         }

         // Write the palindrome List to a file
         FileProcessor.listToFile("palindromes.txt", palindromes);
      }
      catch (IOException e) {
         e.printStackTrace();
      }
   }
}
