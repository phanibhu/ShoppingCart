package com.ultralesson.shoppingcart.test;

import com.ultralesson.shoppingcart.Items;
import com.ultralesson.shoppingcart.ShoppingCart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest {

    @Test

    public void shoppingCartTest(){
        Items items = new Items("Milk",30,4);
        Items items1 = new Items("Newspaper",10,1);
        Items items2 = new Items("Apple",30,4);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItems(items);
        shoppingCart.addItems(items1);
        shoppingCart.addItems(items2);
        shoppingCart.getTotalItems();
        shoppingCart.addAmount(items);
        shoppingCart.addAmount(items1);
        shoppingCart.addAmount(items2);
        shoppingCart.getAmount();
        shoppingCart.setMilkPackets(items);
        shoppingCart.setMilkPackets(items1);
        shoppingCart.setMilkPackets(items2);
        shoppingCart.getTotalMilkPackets();
        Assert.assertEquals(3,shoppingCart.getTotalItems().size());
        Assert.assertEquals(6,shoppingCart.getTotalMilkPackets());
        Assert.assertEquals(237.5,shoppingCart.getAmount());
    }
}
