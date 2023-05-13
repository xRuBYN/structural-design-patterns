package com.tmps.structural.bridge;

public class CarToy extends Toy{

  public CarToy(Material material) {
    super(material);
  }

  @Override
  void createToy() {
    System.out.println("Create a car");
    material.useMaterial();
  }
}
