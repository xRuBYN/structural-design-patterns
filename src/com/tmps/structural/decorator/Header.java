package com.tmps.structural.decorator;

public class Header extends PageDecorator{

  public Header(Page page) {
    super(page);
  }

  @Override
  public String createPage() {
    return super.createPage() + createHeader();
  }

  private static String createHeader() {
    return "Create Header for page. ";
  }
}
