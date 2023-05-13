package com.tmps.structural.decorator;

public class PageDecorator implements Page {

  Page page;

  public PageDecorator(Page page) {
    this.page = page;
  }

  @Override
  public String createPage() {
    return page.createPage();
  }
}
