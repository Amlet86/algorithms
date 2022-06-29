package ru.amlet.interfaces;

public interface A {

    default void test(){
        System.out.println("A");
    }
}
