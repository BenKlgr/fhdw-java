package com.klingeler.car;

public class BaseCar {

  float maxSpeed;
  String color;

  public BaseCar() {
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setMaxSpeed(float maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public String getColor() {
    return color;
  }

  public float getMaxSpeed() {
    return maxSpeed;
  }
}
