package com.klingeler.car;

public class CarBuilder {

  private BaseCar element;

  private void createIfNotCreatedYet() {
    if (element == null) {
      element = new BaseCar();
    }
  }

  public CarBuilder setColor(String color) {
    createIfNotCreatedYet();
    element.setColor(color);
    return this;
  }

  public CarBuilder setMaxSpeed(float maxSpeed) {
    createIfNotCreatedYet();
    element.setMaxSpeed(maxSpeed);
    return this;
  }

  public BaseCar build() {
    return element;
  }
}
