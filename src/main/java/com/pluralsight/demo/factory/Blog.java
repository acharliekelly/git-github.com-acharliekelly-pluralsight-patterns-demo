package com.pluralsight.demo.factory;

import com.pluralsight.demo.factory.pages.AboutPage;
import com.pluralsight.demo.factory.pages.ContactPage;
import com.pluralsight.demo.factory.pages.PostPage;

public class Blog extends Website {
    
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }
}
