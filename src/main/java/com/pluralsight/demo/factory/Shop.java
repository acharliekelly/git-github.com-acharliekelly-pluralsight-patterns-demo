package com.pluralsight.demo.factory;

import com.pluralsight.demo.factory.pages.CartPage;
import com.pluralsight.demo.factory.pages.ItemPage;
import com.pluralsight.demo.factory.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new ItemPage());
        pages.add(new SearchPage());
        pages.add(new CartPage());
    }
}
