import java.io.*;
import java.util.*;


public class day7 {

    public static void main(String[] args) {
        System.out.print("Enter number of items in the array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the items in the array: ");
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        System.out.print("The result is: ");
        for(int i = n-1; i >= 0; i--)
            System.out.print( arr[i] + " ");
    }
}