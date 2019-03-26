package interfaces;

public interface Tributavel {
    /**
     * Toda interface é abstrata e todos os atributos são considerados constantes
     * Com interface é possivel implementar mais de uma, ja com classe abstrata não é possivel
     * Interface nao são instanciadas, pode ser utilizado uma variavel com o nome da Interface mas nunca instanciar
     */
    double IMPOSTO = 0.2;

    public void calcularImposto();

}
