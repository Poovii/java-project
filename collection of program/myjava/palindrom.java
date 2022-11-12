package myjava;

import java.util.Scanner;

public class palindrom {
           public static void main(String[] args) {
	
		   
		    String original, reverse = "";//hello
		    Scanner in = new Scanner(System.in);

		    System.out.println("Enter a string ");
		    original = in.nextLine();
		    
		    
		    int length = original.length();//length=5

		    for (int i = length - 1 ; i >= 0 ; i--)//5-1;
		    reverse = reverse + original.charAt(i);//

		  if(original.equals(reverse))  
		      System.out.println("The string is palindrome");
		  
		  else
		      System.out.println("The string is not palindrome");
		  
		  }
		  
	
	
	}


