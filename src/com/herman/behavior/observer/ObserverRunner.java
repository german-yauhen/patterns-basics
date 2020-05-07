package com.herman.behavior.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.registerNewsPortal(new OnlinerNewsPortal());
        newsAgency.publishNews("Observer was implemented.");
        newsAgency.publishNews("First news.");

        newsAgency.registerNewsPortal(new TutByNewsPortal());

        newsAgency.publishNews("Second news.");

        publishNewsPortals(newsAgency);
    }

    private static void publishNewsPortals(NewsAgency newsAgency) {
        newsAgency.getNewsPortals().forEach(
                newsPortal -> newsPortal.getCollectionOfNews().forEach(System.out::println)
        );
    }
}
