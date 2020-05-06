package com.herman.behavior.observer;

import java.util.ArrayList;

public class OnlinerNewsPortal extends NewsPortal {

    private static final String NEWS_TITLE_PREFIX = "onliner.by:\n";

    public OnlinerNewsPortal() {
        collectionOfNews = new ArrayList<>();
    }

    @Override
    protected void update(String news) {
        collectionOfNews.add(NEWS_TITLE_PREFIX + news);
    }
}
