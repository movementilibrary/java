package interfaces.test;

import interfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p1 = new Produto("notebook", 1.0, 100);

        p1.calculaFrete();
        p1.calcularImposto();
        System.out.println(p1);
    }
}
