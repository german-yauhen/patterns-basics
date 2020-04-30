package com.herman.creation.factory.website.shop;

import com.herman.creation.factory.content.shop.BookingPage;
import com.herman.creation.factory.content.shop.CheckoutPage;
import com.herman.creation.factory.content.shop.SearchPage;
import com.herman.creation.factory.website.Website;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new SearchPage());
        pages.add(new BookingPage());
        pages.add(new CheckoutPage());
    }

    @Override
    public String toString() {
        return "Shop{" +
                "pages=" + getPages() +
                '}';
    }
}
