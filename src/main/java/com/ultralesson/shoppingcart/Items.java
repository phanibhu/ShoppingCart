package com.ultralesson.shoppingcart;

public class Items {

    private String itemName;

    private int amount;

    private int quantity;

    public Items(String itemName, int amount, int quantity){
        this.itemName = itemName;
        this.amount = amount;
        this.quantity = quantity;
    }

    public String getItemName(){
        return itemName;
    }
    public int getAmount(){
        return amount;
    }

    public int getQuantity()
    {
        return quantity;
    }


}
