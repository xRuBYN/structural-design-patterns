package com.tmps.structural.bridge;

public abstract class Toy {
  public Material material;

  public Toy(Material material) {
    this.material = material;
  }

  abstract void createToy();
}
