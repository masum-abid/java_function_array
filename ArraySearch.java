//Problem 2:1 
//Take input from a user and check if the number exists in the array

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){
      boolean found = false;
      int ind = 0;
      int arr[] = {1, 3, 5, 7, 2, 4, 6, 8};
      System.out.println("Enter the value to be searched: ");
      Scanner sc = new Scanner(System.in);
      int searchVal = sc.nextInt();
      for (int i = 0; i<arr.length; i++){
         if(arr[i] ==  searchVal){
            found = true;
            ind = i;
            break;
         }
      }
      if(found){
         System.out.println("The number " + searchVal + " is found on index " + ind);
         sc.close();
      }else{
         System.out.println("The number is not found.");
      }
   }

}
