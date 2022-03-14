package com.shafhaz;

public class Application {
    public static void main(String[] args) {

        CarTelescopic1 carTelescopic1=new CarTelescopic1("full"); //Bad way of coding
        System.out.println(carTelescopic1);

        CarTelescopic2 carTelescopic2=new CarTelescopic2("full"); //Bad way of coding
        System.out.println(carTelescopic2);

        Car.Builder builder = new Car.Builder("Full");      //Correct Way
        Car car=builder.dropOfLocation("LA").roadAssistance("full").build();
        System.out.println(car);

    }
}
