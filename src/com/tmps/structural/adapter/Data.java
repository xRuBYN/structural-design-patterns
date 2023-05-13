package com.tmps.structural.adapter;

import java.io.Serializable;
import java.util.Arrays;

public class Data implements Serializable {
  private String imageName;

  private String extension;

  public Data(String imageName, String extension) {
    this.imageName = imageName;
    this.extension = extension;
  }

  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  @Override
  public String toString() {
    return "Data{" +
        "imageName='" + imageName + '\'' +
        ", extension='" + extension + '\'' +
        '}';
  }
}
