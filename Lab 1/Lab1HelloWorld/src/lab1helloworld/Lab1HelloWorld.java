/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1helloworld;

//import scanner which allows us to read input from the console
import java.util.Scanner;

/**
 *
 * @author zane neuschuler, probably
 */
public class Lab1HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare 2 string variables and initialize a blank string value
        String name = "";
        String message = "";
        
        //create a scanner object that reads what user types in 
        Scanner sc = new Scanner(System.in);
        
        //prompt user for name
        System.out.print("What is your name?");
        name = sc.next(); //read input
        
        //format the message
        message = "Hello " + name + ", welcome to Java programming!";
        
        //display the goddamn message
        System.out.println(message);
    }
    
}
