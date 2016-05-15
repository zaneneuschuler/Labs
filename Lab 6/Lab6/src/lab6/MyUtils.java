/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.text.DecimalFormat;

//any import statements go between package statement and class declaration
/**
 *
 * @author legsl_000
 */
//user defined class
public class MyUtils {
        //code adapted from the decimal format handout
        public static String formatNum(float value, String fmt) {
                String result = " ";
                
                //create the decimal format object 
                DecimalFormat df = new DecimalFormat(fmt);
                
                //format the number and assign to a variable
              result = df.format(value);
                return result;
        }//end format num
        
        public static boolean isInteger(String s){
            boolean result = false;
            
            //sneak peak at chapter 10 try to do something and if it fails, the catch block will come to our rescue
            try {
                //convert integer to a string
                int val = Integer.parseInt(s);
                result = true; //if we make it here, the input value is an int
                
            }//end try
            catch (Exception ex) {
                    result = false;//garbage or non-integer
            }
            return result;
        }
    
    public static int tryParseInt(String s, int defaultVal) {
        
        try {
            return Integer.parseInt(s);
        }
        catch(Exception ex) {
            return defaultVal;
        }
    }
    public static int findItem(int values[], int val) {
        //declare stuff
        int i = 0;
        int sub = -1;
        int max = values.length; //get the size of the array
        
        //do work
        while(i < max && sub == -1) {
            if (val ==  values[i]) {
                sub = i;
            }
            
            i++;
        }
       
        
        
        return sub;
    }
    
       public static int findItem(String values[], String val) {
        //declare stuff
        int i = 0;
        int sub = -1;
        int max = values.length; //get the size of the array
        
        //do work
        while(i < max && sub == -1) {
            if (val.equalsIgnoreCase(values[i])) {
                sub = i;
            }
            
            i++;
        }
       
        
        
        return sub;
    }
    
    
    
    
    
    
    
    
    
    
}//end of myutils class, anything below here is no bueno
