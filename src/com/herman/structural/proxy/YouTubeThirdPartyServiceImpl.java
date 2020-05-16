package com.herman.structural.proxy;

import java.util.UUID;

public class YouTubeThirdPartyServiceImpl implements YouTubeThirdPartyService {

    @Override
    public Video getVideo(String id) {
        connectToServer("http://www.youtube.com/" + id);
        return getSomeVideo(id);
    }

    private Video getSomeVideo(String id) {
        return new Video(id, "Video of " + id, "Content: [" + UUID.randomUUID().toString() + "]");
    }

    private void connectToServer(String url) {
        System.out.println("Connecting to " + url + "...");
        int requestTime = random(1, 5) * 1000;
        try {
            Thread.sleep(requestTime);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Connected! Request time: " + requestTime + " ms.");
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
