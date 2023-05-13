package com.tmps.structural.adapter;

public class Main {
  public static void main(String[] args) {
    Data data = new Data("image", ".png");
    Request request = new UDPRequest();
    request.send(data);
    request = new RequestAdapter();
    request.send(data);
  }
}
