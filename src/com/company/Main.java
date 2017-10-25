
package com.company;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Keyboar=new Scanner(System.in);

        ShoppingCart newShoppingCart=new ShoppingCart();

        ArrayList<String>ShoppingCart=new ArrayList<>();
        ArrayList<String> GroceryItem= new ArrayList<>();

        String entered="y";
        String item="";
        Scanner keyboard = new Scanner(System.in);

        do{

            GroceryItem newgroceryitem=new GroceryItem();
            System.out.print("Enter an item to add to your grocery list:");
            newgroceryitem.setName(keyboard.nextLine());;
            System.out.print(("enter the price"));
            newgroceryitem.setPrice(Keyboar.nextDouble());
            System.out.print("Do you want to continue?");
            entered = keyboard.nextLine();

        }while(entered.equalsIgnoreCase("y")||!entered.equalsIgnoreCase("n"));
    }
}


