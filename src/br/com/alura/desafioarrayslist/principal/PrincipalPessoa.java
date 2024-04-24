package br.com.alura.desafioarrayslist.principal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrincipalPessoa {
    private String nome;
    private int idade;

    public static void main(String[] args) {

        var pj1 = new PessoaJuridica("35400199330001", "Luis Cutilak M.E" );
        ArrayList<PessoaJuridica> listaDeEmpresas = new ArrayList<>();
        listaDeEmpresas.add(pj1);
        System.out.println(pj1);

        var pj2 = new PessoaJuridica("98878787080001", "Murilo Cutilak M.E");
        listaDeEmpresas.add(pj2);
        System.out.println(pj2);

        var pj3 = new PessoaJuridica("722277394870001", "L.M Cutilak M.E");
        listaDeEmpresas.add(pj3);
        System.out.println(pj3);

        System.out.println("O tamanho da lista de empresas é: " + listaDeEmpresas.size());
        System.out.println("A primeira empresa da lista é: " + listaDeEmpresas.get(0));
        System.out.println(listaDeEmpresas);

    }


}
