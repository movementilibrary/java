package equals.teste;

import equals.classes.Celular;

public class CelularTeste {

    public static void main(String[] args) {
        Celular c1 = new Celular("Iphone", "1");
        Celular c2 = new Celular("Iphone", "1");

        System.out.println(c1.equals(c2));

    }
}
