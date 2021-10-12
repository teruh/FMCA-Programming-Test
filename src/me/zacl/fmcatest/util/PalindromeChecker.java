package me.zacl.fmcatest.util;

/**
 * This class holds functions related to the checking of Strings to see if they are palindromes
 * or not. In other words, is the string the same both forwards and backwards?
 * 10-12-2021
 *
 * @author Zachary Clark
 */
public class PalindromeChecker {
   /**
    * Checks a string to see if it's a palindrome
    *
    * @param text String that will be checked
    * @return True or false - depending on if string is a palindrome
    */
   public static boolean isPalindrome(String text) {
      // We do not care about punctuation, spacing, or letter case when checking for palindromes
      // Save a new string ignoring those, and check it!
      String textToCheck = text.toLowerCase().trim().replaceAll("[\\W]", "");
      return checkPalindrome(textToCheck);
   }

   /**
    * Recursive implementation for palindrome checking
    *
    * @param textToCheck String that will be checked
    * @return True or false - depending on if string is a palindrome
    */
   private static boolean checkPalindrome(String textToCheck) {
      int stringLength = textToCheck.length();

      // Base case: we're down to the last character, or the string is empty
      if (stringLength < 2) {
         return true;
      }
      else {
         // Check that the characters at the beginning and end of the string are the same
         if (textToCheck.charAt(0) != textToCheck.charAt(stringLength - 1)) {
            return false;
         }
         else {
            // Recursive case: we have more characters to check; cut off the first letter
            // and the last letter and check the resulting string
            return isPalindrome(textToCheck.substring(1, stringLength - 1));
         }
      }
   }
}
