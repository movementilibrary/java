package colections.classes;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Michel");
        nomes.add("Jac");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove("Michel");
        System.out.println("------------------------");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Sophia");
        nomes2.addAll(nomes);
        for (String nome : nomes2) {
            System.out.println(nome);

        }
    }
}
