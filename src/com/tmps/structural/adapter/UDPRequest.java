package com.tmps.structural.adapter;

public class UDPRequest implements Request {

  public UDPRequest() {
  }

  @Override
  public void send(Data data) {
    System.out.println("Sending data..." + data);
  }
}
