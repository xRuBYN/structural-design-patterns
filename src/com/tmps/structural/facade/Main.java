package com.tmps.structural.facade;

public class Main {

  public static void main(String[] args) {
    VideoService videoService = new VideServiceImpl();
    VideoResources videoResources = new VideoResources(videoService);
    Video video = new Video("today", new byte[]{});
    videoResources.convertVideo(video);
    videoResources.renderVideo(video);
  }
}
