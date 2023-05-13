package com.tmps.structural.decorator;

public class Footer extends PageDecorator{

  public Footer(Page page) {
    super(page);
  }

  @Override
  public String createPage() {
    return super.createPage() + createFooter();
  }

  private static String createFooter() {
    return "Create Footer for page. ";
  }
}
