//Problem 2:3
//Suppose, in a company , here are some employee salaries in an array

import java.util.Arrays;

public class FindSalary {
    public static int Highest(Integer[] arr, int k){
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static void main(String[] args){
        Integer arr[] = new Integer[] {35000, 25000, 28000, 32500, 44000, 32800};
        int k = arr.length - 2;
        System.out.print("Third highest salary is: " + Highest(arr, k));
        } 
}
