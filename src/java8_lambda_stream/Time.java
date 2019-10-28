package java8_lambda_stream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        //Lista
        retornaIdadeTime();
        ordenaTimesPeloNomeAsc();
        ordenaTimesPeloNomeDesc();
        retornaSomenteVisitantes();
        retornaDistinct();
        retornaLimit();
        retornaAverage();
        filtraTimesEspecificos();
        buscaTimeIniciaComLetraS();
        contarTodosOsTimesMandantes();
        retornaNovoDistinct();

        //Map
    }



    public static void retornaIdadeTime(){
        List<Time> times = new Time().populaTime();
             System.out.println("---------Devolve Idade do Time-------------");
        times.stream()
                .filter(time -> time.getNome()
                        .equals("Corinthians"))
                .mapToInt(Time::getIdade)
                .forEach(System.out::println);
    }

    public static void ordenaTimesPeloNomeAsc(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Ordenando Asc---------------");
        times.stream()
                .sorted(Comparator.comparing(Time::getNome))
                .map(Time::getNome)
                .forEach(System.out::println);
    }

    public static void ordenaTimesPeloNomeDesc(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Ordenando Desc---------------");
        times.stream()
                .sorted(Comparator.comparing(Time::getNome).reversed())
                .map(Time::getNome)
                .forEach(System.out::println);
    }

    public static void retornaSomenteVisitantes(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Retorna Visitantes---------------");
        times.stream()
                .filter(time -> time.isMandante() == false)
                .map(Time::getNome)
                .forEach(System.out::println);
    }

    public static void retornaDistinct(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Retorna Disctinct---------------");
        times.stream()
                .map(Time::getNome)
                .distinct()
                .forEach(System.out::println);
    }

    public static void retornaNovoDistinct(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Retorna Novo Disctinct---------------");
        times.stream()
                .filter(distinctByKey(Time::getIdade))
                .forEach(s -> System.out.println(s.getNome()));
    }

    /**
     * Stateful filter. T is type of stream element, K is type of extracted key.
     */
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> key) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(key.apply(t), Boolean.TRUE) == null;
    }

    public static void retornaLimit(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Retorna Limit---------------");
        times.stream()
                .map(Time::getNome)
                .limit(2)
                .forEach(System.out::println);
    }


    public static void retornaAverage(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Retorna Average---------------");
        Double mediaIdade = times.stream()
                             .mapToInt(Time::getIdade)
                             .average()
                             .getAsDouble();
        System.out.println(mediaIdade);
    }

    public static void filtraTimesEspecificos(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Retorna Times Com C---------------");
        times.stream().filter(p -> p.getNome().startsWith("C"))
                .map(Time::getNome)
                .forEach(System.out::println);

    }

    public static void buscaTimeIniciaComLetraS(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Retorna Times Com C---------------");
        List<String> timesComInicioS = times.stream()
                                      .filter(p -> p.getNome().startsWith("S"))
                                      .map(Time::getNome)
                                      .collect(Collectors.toList());
        System.out.println(timesComInicioS);
    }

    public static void contarTodosOsTimesMandantes(){
        List<Time> times = new Time().populaTime();
        System.out.println("------------Conta Times Mandantes---------------");
        long quantidadeTimesMandantes = times.stream()
                                        .filter(p -> p.isMandante() == true)
                                        .count();
        System.out.println(quantidadeTimesMandantes);
    }



    public static List<Time> populaTime(){
        Time t1 = new Time(1L, false, "Corinthians",100);
        Time t2 = new Time(2L, true, "Palmeiras",90);
        Time t3 = new Time(3L, false, "Sao Paulo",120);
        Time t4 = new Time(4L, false, "Oeste",100);
        Time t5 = new Time(5L, true, "Criciuma",80);
        Time t6 = new Time(6L, true, "Noroeste",2);
        Time t7 = new Time(7L, false, "Santos",13);
        Time t8 = new Time(8L, false, "Real Madrid",14);
        Time t9 = new Time(9L, true, "Barcelona",67);
        Time t10 = new Time(10L, true, "Boca Junior",89);
        Time t11 = new Time(10L, true, "Boca Junior",88);

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
        ((ArrayList) times).add(t11);

        return times;
    }


    public static Map<Long, Time> populaMapaTimes(){

        Time t1 = new Time(1L, false, "Corinthians",100);
        Time t2 = new Time(2L, true, "Palmeiras",90);
        Time t3 = new Time(3L, false, "Sao Paulo",120);
        Time t4 = new Time(4L, false, "Oeste",300);
        Time t5 = new Time(5L, true, "Criciuma",80);
        Time t6 = new Time(6L, true, "Noroeste",2);
        Time t7 = new Time(7L, false, "Santos",13);
        Time t8 = new Time(8L, false, "Real Madrid",14);
        Time t9 = new Time(9L, true, "Barcelona",67);
        Time t10 = new Time(10L, true, "Boca Junior",89);
        Time t11 = new Time(10L, true, "Boca Junior",89);



        Map<Long, Time> mapTime = new HashMap<Long, Time>();
        mapTime.put(1L, t1);
        mapTime.put(2L, t2);
        mapTime.put(3L, t3);
        mapTime.put(4L, t4);
        mapTime.put(5L, t5);
        mapTime.put(6L, t6);
        mapTime.put(7L, t7);
        mapTime.put(8L, t8);
        mapTime.put(9L, t9);
        mapTime.put(10L, t10);

        return mapTime;

    }
}
