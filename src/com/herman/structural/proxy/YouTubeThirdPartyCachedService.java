package com.herman.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class YouTubeThirdPartyCachedService implements YouTubeThirdPartyService {

    private Map<String, Video> cachedVideos = new HashMap<>();

    private YouTubeThirdPartyService youTubeService;

    public YouTubeThirdPartyCachedService() {
        this.youTubeService = new YouTubeThirdPartyServiceImpl();
    }


    @Override
    public Video getVideo(String id) {
        return cachedVideos.computeIfAbsent(id, s -> youTubeService.getVideo(id));
    }
}
