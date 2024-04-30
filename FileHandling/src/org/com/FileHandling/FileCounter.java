package org.com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {
    
    	 public static void main(String[] args) {
    	        String fileName = "vtalent.txt"; // replace with your file name
    	        
    	        int charCount = 0;
    	        int wordCount = 0;
    	        int lineCount = 0;

    	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
    	            String line;
    	            while ((line = reader.readLine()) != null) {
    	                charCount += line.length();
    	                String[] words = line.split("\\s+");
    	                wordCount += words.length;
    	                lineCount++;
    	            }
    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        }

    	        System.out.println("Character count: " + charCount);
    	        System.out.println("Word count: " + wordCount);
    	        System.out.println("Line count: " + lineCount);
    	    }
    	}