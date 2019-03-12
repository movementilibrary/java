package java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Time {

    private Long id;
    private boolean mandante;
    private String nome;
    private int idade;

    public Time() { }

    public Time(Long id, boolean mandante, String nome, int idade) {
        this.id = id;
        this.mandante = mandante;
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isMandante() {
        return mandante;
    }

    public void setMandante(boolean mandante) {
        this.mandante = mandante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public static void main(String[] args) {
        List<Time> times = new Time().populaTime();
        times.stream()
                .filter(time -> time.getNome()
                .equals("Corinthians"))
                .map(Time::getIdade)
                .forEach(s -> System.out.println(s));


    }


    public List<Time> populaTime(){
        Time t1 = new Time(1L, true, "Corinthians",100);
        Time t2 = new Time(2L, true, "Palmeiras",90);
        Time t3 = new Time(3L, false, "Sao Paulo",120);
        Time t4 = new Time(4L, false, "Oeste",300);
        Time t5 = new Time(5L, true, "Criciuma",80);
        Time t6 = new Time(6L, true, "Noroeste",2);
        Time t7 = new Time(7L, false, "Santos",13);
        Time t8 = new Time(8L, false, "Real Madrid",14);
        Time t9 = new Time(9L, true, "Barcelona",67);
        Time t10 = new Time(10L, true, "Boca Junior",89);

        List<Time> times = new ArrayList<Time>();
        ((ArrayList) times).add(t1);
        ((ArrayList) times).add(t2);
        ((ArrayList) times).add(t3);
        ((ArrayList) times).add(t4);
        ((ArrayList) times).add(t5);
        ((ArrayList) times).add(t6);
        ((ArrayList) times).add(t7);
        ((ArrayList) times).add(t8);
        ((ArrayList) times).add(t9);
        ((ArrayList) times).add(t10);

        return times;

    }
}
