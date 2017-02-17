import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        input.hasNextLine();
        
                
        for(int j = 0; j < tests; j++) {
            String string = input.next();
            String odd = "";
            String even = "";
            for(int i = 0; i < string.length(); i++) {
                if(i == 0 || i % 2 == 0)
                    even+= string.charAt(i);
                else if(i % 2 == 1)
                    odd+= string.charAt(i);
            }
            System.out.println(even + " " + odd);
        }
        
            
    }
}