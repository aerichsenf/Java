import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
      
      // If n is odd, print Weird
      // If n is even and in the inclusive range of 2 to 5, print Not Weird
      // If n is even and in the inclusive range of 6 to 20, print Weird
      // If n is even and greater than 20, print Not Weird 

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();

             
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1 || n % 2 == 0 && n >= 6 && n <= 20){
         ans = "Weird";
      }
      else if (n % 2 == 0 && n >= 2 && n <= 5 || n % 2 == 0 && n > 20){
         ans = "Not Weird";
      }
    
      System.out.println(ans);
   }
}
