package com.pluralsight.demo.factory;

import java.util.List;

import com.pluralsight.demo.factory.pages.Page;

import java.util.ArrayList;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();


    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite();
}
