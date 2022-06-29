package ru.amlet.interfaces;

public interface B {

    default void test(){
        System.out.println("B");
    }
}
