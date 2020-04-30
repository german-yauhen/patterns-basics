package com.herman.creation.factory.website;

import com.herman.creation.factory.content.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();
}
