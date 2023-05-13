package com.tmps.structural.bridge;

public class Metal implements Material{

  @Override
  public void useMaterial() {
    System.out.println("Use metal for construction");
  }
}
