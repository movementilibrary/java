package interfaces;

public interface Tributavel {
    /**
     * Toda interface � abstrata e todos os atributos s�o considerados constantes
     * Com interface � possivel implementar mais de uma, ja com classe abstrata n�o � possivel
     * Interface nao s�o instanciadas, pode ser utilizado uma variavel com o nome da Interface mas nunca instanciar
     */
    double IMPOSTO = 0.2;

    public void calcularImposto();

}
