//Problem 2:2 
//Input an amount from the user and find out the number of notes from input amount in given array

import java.util.Scanner;

public class CountNotes {
    public static void main(String args[]){
        int currency[] = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        System.out.println("Enter any amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int count = 0;
        sc.close();
        for(int i = 0; i<9; i++){
            count = amount/currency[i];
            if(count != 0){
                System.out.println(currency[i] + "\t" + count);
            }
            amount = amount % currency[i];
        }  
    }
}
