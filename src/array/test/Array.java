package array.test;

import array.classe.Produto;
import array.classe.ProdutoComparator;

import java.util.Arrays;


public class Array {

    public static void main(String[] args) {

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.00);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Tecladdo Reser", 1000.00);
        Produto produto4 = new Produto("012", "Sansung Galaxy", 3250.00);


        Produto [] produtos = new Produto[4];

        produtos[0] = produto1;
        produtos[1] = produto2;
        produtos[2] = produto3;
        produtos[3] = produto4;


        Arrays.sort(produtos, new ProdutoComparator());

        for (Produto produto: produtos) {
            System.out.println(produto);
        }

    }
}
