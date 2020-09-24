package com.features;

public class TimeBasedVersioning {

    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println(version.feature());
        System.out.println(version.interim());
        System.out.println(version.update());
        System.out.println(version.patch());
    }

}
