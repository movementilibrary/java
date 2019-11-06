package colections.test;

import java.util.Objects;

public class CelularTest {
    private String nome;
    private String IMEI;


    public CelularTest(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CelularTest)) return false;
        CelularTest that = (CelularTest) o;
        return nome.equals(that.nome) &&
                IMEI.equals(that.IMEI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, IMEI);
    }
}
