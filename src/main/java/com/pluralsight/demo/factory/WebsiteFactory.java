package com.pluralsight.demo.factory;

public class WebsiteFactory {
    
    public static Website getWebsite(WebsiteType type) {
        switch (type) {
            case SHOP:
                return new Shop();
            case BLOG:
                return new Blog();
            default:
                return null;
        }
    }
}
