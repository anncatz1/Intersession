/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintersession;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author student
 */
public class WordCount {
    public static void main(String[] args) throws Exception {
      String  thisLine = null;
      long LineCount = 0;
      long WordCount = 0;
      Set<String> set = new TreeSet<String>();
      
      try{
         // open input stream test.txt for reading purpose.
         BufferedReader br = new BufferedReader(new FileReader("TomSawyer.txt"));
         while ((thisLine = br.readLine()) != null) {
            LineCount++; 
            String[] words = thisLine.split("[\\s-]");
            WordCount+= words.length; 
            for(int i = 0; i < words.length; i++) {
                set.add(words[i].toUpperCase().replaceAll("[^A-Z]+$", "").replaceAll("^[^A-Z]+", "")
                        .replaceAll("'S$", ""));
            }
         }       
      }
      catch(Exception e){
         e.printStackTrace();
      }
      
      System.out.println(LineCount);
      System.out.println(WordCount);
      
//      for (String word : set)
//          System.out.println(word);
      set.forEach(System.out::println);
      System.out.println(set.size());
   }
}
