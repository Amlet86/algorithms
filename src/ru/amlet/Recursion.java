package ru.amlet;

public class Recursion {

    int countdown(int i) {
        System.out.println(i);
        if (i < 0)
            return i;
        else
            countdown(i - 1);
        return i;
    }

    int fact(int i) {
        if (i == 1)
            return i;
        else
            return i * (fact(i - 1));
    }

}
