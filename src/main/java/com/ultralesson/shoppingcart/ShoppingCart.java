package com.ultralesson.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private ArrayList<Items> totalItems;
    private Map<String, Integer> milkPackets;

    private double totalAmount;

    private int finalMilkPackets = 0;

    int totalAmountOfItems = 0;

    int totalMilkPackets = 0;

    public ShoppingCart() {
        totalItems = new ArrayList<>();
        milkPackets = new HashMap<>();
    }

    public void addItems(Items items) {
        totalItems.add(items);
    }

    public ArrayList<Items> getTotalItems() {
        //System.out.println(totalItems);
        return totalItems;
    }

    public void addAmount(Items items) {
        totalAmountOfItems = items.getAmount() * items.getQuantity() + totalAmountOfItems;
    }

    public void setMilkPackets(Items items) {
        milkPackets.put(items.getItemName(), items.getQuantity());
        totalMilkPackets = milkPackets.get("Milk");
        //System.out.println(totalMilkPackets);
        //System.out.println(milkPackets);
    }


    public int getTotalMilkPackets() {
        for (int i = 1; i <= totalMilkPackets; i++) {
            if (i % 2 == 0) {
                finalMilkPackets = (i / 2) + totalMilkPackets;
                //System.out.println("TotalMilk in offer=  " + finalMilkPackets);
            }
        }
        //System.out.println(totalMilkPackets);
        return finalMilkPackets;
    }


    public double getAmount() {
        double discount;
        int bill = totalAmountOfItems;
        System.out.println(bill);
        if (bill >= 100) {
            discount = (0.05) * bill;
            totalAmount = bill - discount;
        }
        //System.out.println(totalAmountOfItems);
        return totalAmount;
    }


}