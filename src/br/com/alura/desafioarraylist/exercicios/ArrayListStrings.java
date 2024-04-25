package br.com.alura.desafioarraylist.exercicios;

import java.util.ArrayList;


public class ArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Java");
        listaString.add("Javascript");
        listaString.add("Angular");

        for (String palavra : listaString){
            System.out.println(palavra);
        }
    }
}

