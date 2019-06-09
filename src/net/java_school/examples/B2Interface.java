package net.java_school.examples;

public interface B2Interface extends A2Interface {
    @Override
    public default String hello() {
        return "B2 Interface says hello";
    }
}