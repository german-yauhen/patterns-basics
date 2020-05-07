package com.herman.behavior.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Observable
 */
public class NewsAgency {

    private List<String> news;

    /**
     * Observers
     */
    private List<NewsPortal> newsPortals;

    public NewsAgency() {
        news = new ArrayList<>();
        newsPortals = new ArrayList<>();
    }

    public void registerNewsPortal(NewsPortal newsPortal) {
        newsPortals.add(newsPortal);
    }

    public void publishNews(String newsObject) {
        news.add(newsObject);
        newsPortals.forEach(newsPortal -> newsPortal.update(newsObject));
    }

    public List<NewsPortal> getNewsPortals() {
        return Collections.unmodifiableList(newsPortals);
    }

    public List<String> getNews() {
        return Collections.unmodifiableList(news);
    }

}
