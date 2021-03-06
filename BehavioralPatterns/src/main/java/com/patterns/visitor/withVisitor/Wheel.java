package com.patterns.visitor.withVisitor;

public class Wheel implements AtvPart {
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
