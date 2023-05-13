package com.tmps.structural.adapter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RequestAdapter implements Request {
  private TCPRequest request = new TCPRequest();

  @Override
  public void send(Data data) {
    try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos)) {
      oos.writeObject(data);
      oos.flush();
      byte[] object = bos.toByteArray();
      request.sendMessage(object);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
