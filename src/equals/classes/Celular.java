package equals.classes;

import java.util.Objects;

public class Celular {
    private String nome;
    private String IMEI;


    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

//    @Override
//    public boolean equals(Object obj){
//        if(obj == null) return false;
//        if(this == obj) return true;
//        if(this.getClass() != obj.getClass()) return false;
//        Celular outroCelular = (Celular) obj;
//        return IMEI != null ? IMEI.equals(outroCelular.getIMEI()) : false ;
//
//    }


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
}
