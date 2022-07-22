//Problem 2:4
//Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.


import java.util.HashMap;
import java.util.Scanner;

public class BazarList {
    public static void main(String[] args){
        HashMap<String, Integer> pricelist = new HashMap<>();
        
        pricelist.put("rice", 60);
        pricelist.put("oil", 200);
        pricelist.put("salt", 50);
        pricelist.put("potato", 30);

        System.out.println("The available items are: " + pricelist);
        System.out.println("Enter an item: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        searchItem(pricelist, userInput);
        totalSum(pricelist);
        sc.close();
    }

    public static int totalSum(HashMap<String, Integer> pricelist){
        int totalPrice = 0;
        for(int value: pricelist.values()){
            totalPrice += value;
        }
        System.out.println("The toal price of the items is : " + totalPrice);
        return totalPrice;
    }

    public static void searchItem(HashMap<String, Integer> pricelist, String userInput){
        if(pricelist.containsKey(userInput)){
            System.out.println("The price of " + userInput + " is " + pricelist.get(userInput));
        }else{
            System.out.println("Item not found");
        }
    
    }
}
