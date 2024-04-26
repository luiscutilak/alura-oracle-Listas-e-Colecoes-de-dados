package br.com.alura.produtocalculaprecomedio;

import java.util.ArrayList;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public class Main {
        public static void main(String[] args) {

            Produto produto1 = new Produto("teclado", 150.0);
            Produto produto2 = new Produto("mouse", 50.0);
            Produto produto3 = new Produto("joystick", 500.0);
            Produto produto4 = new Produto("placa de video", 700.0);

            ArrayList<Produto> listaProdutos = new ArrayList<>();

            listaProdutos.add(produto1);
            listaProdutos.add(produto2);
            listaProdutos.add(produto3);
            listaProdutos.add(produto4);

            double somaPrecos = 0;

            for (Produto produto : listaProdutos) {
                somaPrecos += produto.getPreco();
            }

            double precoMedio = somaPrecos / listaProdutos.size();
            System.out.println("Preço médio dos produtos: " + precoMedio);

        }


    }
}