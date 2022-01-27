package net.java_school.examples;

public class C2Class implements A2Interface,B2Interface {

    @Override
    public String hello() {
        return B2Interface.super.hello();
    }

}
