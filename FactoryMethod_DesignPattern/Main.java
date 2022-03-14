package com.company;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        //System.out.println("helloooo");
        //NumberFormat numberFormat=NumberFormat.getInstance();

        Package aPackage=PackageFactory.createPackage(PackageCode.BASIC);
        System.out.println(aPackage);

        Package aPackage1=PackageFactory.createPackage(PackageCode.PLATINUM);
        System.out.println(aPackage1);


    }
}
