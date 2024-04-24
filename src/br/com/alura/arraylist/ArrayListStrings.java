package br.com.alura.arraylist;

import java.util.ArrayList;

public class ArrayListStrings {

    public static void main(String[] args) {
        ArrayList strings = new ArrayList<>();
        strings.add("banana");
        strings.add("maça");
        strings.add("laranja");
        strings.add("pera");
        strings.add("uva");

        strings.forEach(System.out::println);
    }
}
