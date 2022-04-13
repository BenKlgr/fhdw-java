package com.klingeler.main;

import com.klingeler.car.BaseCar;
import com.klingeler.car.CarBuilder;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    CarBuilder builder = new CarBuilder();
    BaseCar car = builder
        .setColor("red")
        .setMaxSpeed(120)
        .build();

    System.out.println(car.getColor());
    System.out.println(car.getMaxSpeed());
  }
}