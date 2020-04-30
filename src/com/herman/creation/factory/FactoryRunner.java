package com.herman.creation.factory;

import com.herman.creation.factory.website.Website;
import com.herman.creation.factory.website.WebsiteFactory;
import com.herman.creation.factory.website.WebsiteFactory.WebsiteItem;

public class FactoryRunner {

    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteItem.BLOG);
        System.out.println(blog);

        Website shop = WebsiteFactory.getWebsite(WebsiteItem.SHOP);
        System.out.println(shop);
    }
}
