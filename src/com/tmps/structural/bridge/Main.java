package com.tmps.structural.bridge;

public class Main {

  public static void main(String[] args) {
    Toy[] toys = {new CarToy(new Metal()), new SoldierToy(new Metal()), new SoldierToy(new Wood())};
    for (Toy toy : toys) {
      toy.createToy();
    }
  }
}
