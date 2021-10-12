package me.zacl.fmcatest.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Utilities for file I/O.
 * 10-12-2021
 *
 * @author Zachary Clark
 */
public class FileProcessor {

   /**
    * Reads a file and places each line into an ArrayList of Strings
    *
    * @param fileName path of the file to read from
    * @return an ArrayList of file's contents (Strings)
    * @throws IOException handles errors during file reading
    */
   public static List<String> fileToList(String fileName) throws IOException {
      // Used to store/return file's contents
      List<String> strings;

      // Used to read words from .txt file that will placed into a ArrayList
      BufferedReader reader;

      // Used to store a single line from the file
      String text;

      strings = new ArrayList<>();
      reader = new BufferedReader(new FileReader(fileName));

      // FileReader will continue reading until we've reached a null line
      // Add each line to the ArrayList of Strings
      while ((text = reader.readLine()) != null) {
         strings.add(text);
      }

      reader.close();

      return strings;
   }

   /**
    * Takes a List of Strings and writes each element to a file
    *
    * @param fileName path of the file to write to
    * @param list     List of Strings that will be written to file
    * @throws IOException handles errors during file writing
    */
   public static void listToFile(String fileName, List<String> list) throws IOException {
      BufferedWriter writer;

      writer = new BufferedWriter(new FileWriter(fileName));

      // Write each string in the List to the file
      for (String string : list) {
         writer.write(string + "\n");
      }

      writer.flush();
      writer.close();
   }
}
