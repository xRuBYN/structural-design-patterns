package com.tmps.structural.decorator;

public class Main {
  public static void main(String[] args) {
    Page page = new Footer(new Header(new WordPage()));
    System.out.println(page.createPage());
  }
}
