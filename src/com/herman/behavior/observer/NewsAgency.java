package com.herman.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private List<String> news;
    private List<NewsPortal> newsPortals;

    public NewsAgency() {
        news = new ArrayList<>();
        newsPortals = new ArrayList<>();
    }

}
