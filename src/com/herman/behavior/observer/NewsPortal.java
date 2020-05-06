package com.herman.behavior.observer;

import java.util.Collections;
import java.util.List;

/**
 * Observer
 */
public abstract class NewsPortal {

    protected List<String> collectionOfNews;

    public List<String> getCollectionOfNews() {
        return Collections.unmodifiableList(collectionOfNews);
    }

    protected abstract void update(String news);
}
