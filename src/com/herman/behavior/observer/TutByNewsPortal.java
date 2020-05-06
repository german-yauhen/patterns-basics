package com.herman.behavior.observer;

import java.util.ArrayList;

public class TutByNewsPortal extends NewsPortal {

    private static final String NEWS_TITLE_PREFIX = "tut.by:\n";

    public TutByNewsPortal() {
        collectionOfNews = new ArrayList<>();
    }

    @Override
    public void update(String news) {
        collectionOfNews.add(NEWS_TITLE_PREFIX + news);
    }
}
