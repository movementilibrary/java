package collection.setlist.test;

import collection.arraylist.classes.Produto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTet {

    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.00);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Tecladdo Reser", 1000.00);
        Produto produto4 = new Produto("012", "Sansung Galaxy", 3250.00);

        Set<Produto>  produtoSet = new HashSet<>();

        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto1);


        for (Produto produto: produtoSet) {
            System.out.println(produto);
        }
    }
}
