package com.ultralesson.shoppingcart.test;

import com.ultralesson.shoppingcart.Items;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemsTest {

    @Test
    public void itemTest(){
        Items items = new Items("Milk",30,4);
        Items items1 = new Items("Newspaper",10,1);
        Items items2 = new Items("Apple",30,4);
        Assert.assertEquals("Milk",items.getItemName());
    }

}
