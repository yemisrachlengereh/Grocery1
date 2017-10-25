package com.company;



import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<GroceryItem> GroceryItems;

    public ShoppingCart()
    {
        GroceryItems = new ArrayList<GroceryItem>();

    }

    public void addGroceryItems(GroceryItem toAdd)
    {
        this.GroceryItems.add(toAdd);
    }

    public double getTotal()
    {
        double totalPrice = 0;
        for(GroceryItem g: GroceryItems)
        {
            totalPrice+=g.getPrice();
        }

        return totalPrice;
    }

    public String displayItems()
    {
        String toDisplay="";

        for(GroceryItem g: GroceryItems)
        {
            toDisplay+=g.getName()+"                "+g.getPrice()+"\n";
        }

        return toDisplay;

    }
}