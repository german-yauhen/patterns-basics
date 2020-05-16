package com.herman.structural.proxy;

public class YouTubeProxyRunner {
    public static void main(String[] args) {
        YouTubeThirdPartyCachedService service = new YouTubeThirdPartyCachedService();
        System.out.println(service.getVideo("funny monkey"));
        System.out.println(service.getVideo("funny cats"));
        System.out.println(service.getVideo("funny monkey"));
        System.out.println(service.getVideo("funny cats"));
    }
}
