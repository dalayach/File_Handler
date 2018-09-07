package com.dalayach.File_Handler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;   

public class File_Handler
{

   public File_Handler()
   {
            
   
   
   }
   
   /**
    *  Loads the file
    *  
    *  @param  fileName       the name of the file
    *  @return                a String containing the file contents
    */
   public String load_File(String fileName)
   {
   
      String result = "";
      String temp = null;
      File file = null;
      FileReader fileR = null;
      BufferedReader reader = null;
                                 
      if(fileName != null && !(fileName.isEmpty()))
      {
      
         file = new File(fileName);
                           
         if(file.exists() == true)
         {
         
            try
            {
            
               fileR = new FileReader(file);
               reader = new BufferedReader(fileR);
                          
               
               
               try
               {
                  
                  temp = reader.readLine();
                  
               }
               catch(IOException ioe)
               {
                  
                  temp = " ";
                  result = "";
                  
               }
                  
               if(temp != null)
               {
                  
                  result += temp;
                  
               }
               
               
            
            }
            catch(FileNotFoundException fnfe)
            {
            
            //nothing necessary
               result = "";
            
            }
         
         }
         
         else
         {
         
            System.out.println("\nFile name is invalid");
            result = "";
         
         }
                    
      }
      
      else
      {
      
         System.out.println("\nNo file name was entered");
         result = "";
      
      }
      
      return result;
   
   }

   public static void main(String[] args)
   {
   
      File_Handler fh = new File_Handler();
   
   }

}