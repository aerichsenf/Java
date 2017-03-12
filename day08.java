import java.util.*;
import java.io.*;

/******************************************************************
* This challenge will use Key-Value pair mapping using Dictionary
* data structure
******************************************************************/

class day08{
	public static void main(String[] args){
		//create a Scanner object
		Scanner input = new Scanner(System.in);

		//Get the number of entries
		System.out.print("Enter the number of entries in the phone book: ");
		int n = input.nextInt();

		Map<String,String> phoneBook = new HashMap<String, String>();
		System.out.print("Enter the name followed by the phone number: ");

		String name; 
		String phone;


		for (int i = 0; i < n; i++){
			name = input.next();
			phone = input.next();
			phoneBook.put(name, phone);
		}
        
        System.out.print("What name are you looking for? ");
        String[] nameSearch = new String[n];
        for (int i = 0; i < n; i++)
            nameSearch[i] = input.next();
        
        for (int i = 0; i < n; i++){
            if(phoneBook.get(nameSearch[i]) == null)
            	System.out.println("Not found");
		else
			System.out.println(nameSearch[i] + "=" + phoneBook.get(nameSearch[i]));      
        }
		
		

		input.close();

	}
}