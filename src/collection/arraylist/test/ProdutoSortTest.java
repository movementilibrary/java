package collection.arraylist.test;

import collection.arraylist.classes.Produto;
import collection.arraylist.classes.ProdutoComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoSortTest {

    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList();

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.00);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Tecladdo Reser", 1000.00);
        Produto produto4 = new Produto("012", "Sansung Galaxy", 3250.00);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);

        Collections.sort(listaProdutos, new ProdutoComparator());

        for (Produto produto: listaProdutos) {
            System.out.println(produto);
        }

    }
}
