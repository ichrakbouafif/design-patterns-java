package com.designpatterns.creational.builder.productConfiguration;

public class Main {
    public static void main(String[] args) {

        Computer gamingPc = new Computer.Builder("Intel i9", 32)
                .storage(2000)
                .gpu(true)
                .bluetooth(true)
                .build();

        Computer officePc = new Computer.Builder("Intel i5", 16)
                .storage(512)
                .build();

        System.out.println(gamingPc);
        System.out.println(officePc);
    }
}
