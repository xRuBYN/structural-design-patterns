package com.tmps.structural.facade;

public interface VideoService {
  byte[] convert(Video video);

  void render(Video video);
}
