package com.herman.creation.factory.website;

import com.herman.creation.factory.website.blog.Blog;
import com.herman.creation.factory.website.shop.Shop;

public class WebsiteFactory {

    public enum WebsiteItem {
        BLOG, SHOP;
    }

    public static Website getWebsite(WebsiteItem websiteItem) {
        switch (websiteItem) {
            case BLOG: {
                return new Blog();
            }

            case SHOP: {
                return new Shop();
            }

            default:
                return null;
        }
    }

}
