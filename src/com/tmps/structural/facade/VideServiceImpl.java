package com.tmps.structural.facade;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class VideServiceImpl implements VideoService {

  @Override
  public byte[] convert(Video video) {
    try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos)) {
      oos.writeObject(video);
      oos.flush();
      byte[] object = bos.toByteArray();
      System.out.println("Converting in byte array...");
      return object;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void render(Video video) {
    System.out.println("Do some hard logic");
    System.out.println("Render video... " + video);
  }
}
