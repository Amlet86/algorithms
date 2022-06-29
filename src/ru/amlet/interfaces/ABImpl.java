package ru.amlet.interfaces;

public class ABImpl implements A, B {

     @Override
     public void test() {
          A.super.test();
          B.super.test();
     }
}
