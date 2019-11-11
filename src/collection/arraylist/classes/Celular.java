package collection.arraylist.classes;

import java.util.Objects;

public class Celular {

        private String nome;
        private String IMEI;


        public Celular(String nome, String IMEI) {
            this.nome = nome;
            this.IMEI = IMEI;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Celular)) return false;
        Celular celular = (Celular) o;
        return nome.equals(celular.nome) &&
                IMEI.equals(celular.IMEI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, IMEI);
    }


    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }
}
