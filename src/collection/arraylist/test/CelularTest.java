package collection.arraylist.test;

import collection.arraylist.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class CelularTest {

    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy", "123");
        Celular celular2 = new Celular("Ifone", "9876");
        Celular celular3 = new Celular("Sony", "012");

        List<Celular> listaCelular = new ArrayList<>();
        listaCelular.add(celular1);
        listaCelular.add(celular2);
        listaCelular.add(celular3);

        for (Celular celular: listaCelular) {
            System.out.println(celular);

        }

        Celular celular4 = new Celular("Sony", "012");
        System.out.println(listaCelular.contains(celular4));


    }
}
