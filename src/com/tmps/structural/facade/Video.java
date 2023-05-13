package com.tmps.structural.facade;

import java.io.Serializable;
import java.util.Arrays;

public class Video implements Serializable {
  private String name;

  private byte[] content;

  public Video(String name, byte[] content) {
    this.name = name;
    this.content = content;
  }

  @Override
  public String toString() {
    return "Video{" +
        "name='" + name + '\'' +
        ", content=" + Arrays.toString(content) +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }
}
