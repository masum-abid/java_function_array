//Problem 2:5
//Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()

import java.util.Scanner;

public class MathCalc{
    public static void main(String[] args){
        double[] arr = new double[5];
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextDouble();    
        }
        System.out.println("The average of the numbers are: " + average(arr, total));
        System.out.println("The odd numbers are: " + countOddNumbers(arr));
        System.out.println("The even numbers are: " + countEvenNumbers(arr));
        sc.close();
    }

    public static double average(double[] arr, double total){
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        double avg = total/arr.length;
        return avg;
    }

    public static int countOddNumbers(double[] arr){
        int oddSize = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0)
                oddSize++;
        }
        return oddSize;
    }

    public static int countEvenNumbers(double[] arr){
        int oddSize = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0)
                oddSize++;
        }
        return oddSize;
    }
}
