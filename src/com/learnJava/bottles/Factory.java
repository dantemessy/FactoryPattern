package com.learnJava.bottles;

public class Factory {

    public Bottle getBottle(String brand){

        switch (brand){
            case "cola":
                return new Cola();
            case "fanta":
                return new Fanta();
            case "pepsi":
                return new Pepsi();
            default:
                return null;
        }

    }


}
