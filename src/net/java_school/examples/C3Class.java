package net.java_school.examples;

public class C3Class implements A3Interface,B3Interface {

    @Override
    public String hello() {
        return B3Interface.super.hello();
    }

}