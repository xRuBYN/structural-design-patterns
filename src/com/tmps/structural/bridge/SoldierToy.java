package com.tmps.structural.bridge;

public class SoldierToy extends Toy{

  public SoldierToy(Material material) {
    super(material);
  }

  @Override
  void createToy() {
    System.out.println("Create a soldier");
    material.useMaterial();
  }
}
