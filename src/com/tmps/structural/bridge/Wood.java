package com.tmps.structural.bridge;

public class Wood implements Material{

  @Override
  public void useMaterial() {
    System.out.println("Use wood for construction");
  }
}
