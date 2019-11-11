package collection.arraylist.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Michel");
        nomes.add("Sophia");
        nomes.add("Jac");

        Collections.sort(nomes);
        for (String nome: nomes) {
            System.out.println(nome);
        }
    }


}
