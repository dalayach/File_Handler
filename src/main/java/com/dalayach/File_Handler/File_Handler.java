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
   private static String load_File(String fileName)
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

   public static String fetch_Secret(String option)
   {
   
      if(option.toLowerCase().equals("wot"))
         return load_File("C:/Users/David/Documents/__Programming/__JAVA/___Workspace/_temp holder/keys_for_applications/WOT_PlayerComp_V1_App_ID.txt");
      
      /*
      else if(option.equals("") || option.equals(""))
         return load_File("");
         */
         
      else if(option.toLowerCase().equals("google+") || option.toLowerCase().equals("youtube") || option.toLowerCase().equals("google"))
         return load_File("C:/Users/David/Documents/__Programming/__JAVA/___Workspace/_temp holder/keys_for_applications/google_api_key.txt");
      
      else 
         return "";
   
   }
   
   public static String fetch_Email()
   {
   
      return load_File("C:/Users/David/Documents/__Programming/__JAVA/___Workspace/_temp holder/keys_for_applications/programming_email.txt");
   
   }

   public static void main(String[] args)
   {
   
      File_Handler fh = new File_Handler();
   
   }

}