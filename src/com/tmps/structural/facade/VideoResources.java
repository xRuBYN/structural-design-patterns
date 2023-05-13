package com.tmps.structural.facade;

public class VideoResources {
  private final VideoService videoService;

  public VideoResources(VideoService videoService) {
    this.videoService = videoService;
  }

  public byte[] convertVideo(Video video) {
    byte[] buffer = videoService.convert(video);
    return buffer;
  }

  public void renderVideo(Video video) {
    videoService.render(video);
  }

}
