package com.herman.creation.factory.website.blog;

import com.herman.creation.factory.content.blog.ContactPage;
import com.herman.creation.factory.content.blog.PostPage;
import com.herman.creation.factory.content.blog.WelcomePage;
import com.herman.creation.factory.website.Website;

public class Blog extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new ContactPage());
        pages.add(new PostPage());
        pages.add(new WelcomePage());
    }

    @Override
    public String toString() {
        return "Blog{" +
                "pages=" + getPages() +
                '}';
    }
}
