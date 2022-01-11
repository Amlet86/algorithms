package ru.amlet.Yandex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;

public class Task2 {

    public static void main(String[] args) throws IOException
    {
        StreamTokenizer in = new StreamTokenizer(
            new BufferedReader(
                new LineNumberReader(
                    new FileReader("src/ru.amlet.Yandex/input.txt"))));

        PrintStream out = new PrintStream("src/ru.amlet.Yandex/output.txt");

        int a, b;
        in.nextToken();
        a = (int) in.nval;
        in.nextToken();
        b = (int) in.nval;
        out.println(a + b);
    }

}
