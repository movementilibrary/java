package interfaces;

public class Principal {
    public static void main(String[] args) {
        Produto p = new Produto("Notbook",4, 3.000);
        p.calculaFrete();
        p.calcularImposto();
        System.out.println(p);
    }
}
