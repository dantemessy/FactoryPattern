package com.learnJava;

import com.learnJava.bottles.Bottle;
import com.learnJava.bottles.Factory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Factory factory = new Factory();

        factory.getBottle("cola").getReview();



    }
}
