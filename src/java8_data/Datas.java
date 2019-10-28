package java8_data;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {
        imprimeDataAtual();
        imprimeDiferencaDeDias();
        somaQuatroAnosPeriodoAtual();
        imprimeDataFormatada();
        imprimeAgora();
        transformaAgoraLocalDate();
        calculaDiferencaHora();

    }

    public static void imprimeDataAtual (){
        LocalDate hoje = LocalDate.now();
        System.out.println("Imprimindo data atual -> " + hoje);
    }

    public static void imprimeDiferencaDeDias(){
        LocalDate hoje = LocalDate.now();

        LocalDate olimpiadas = LocalDate.of(2022, Month.JUNE, 5);
        Period periodo = Period.between(hoje, olimpiadas);
        System.out.println("Imprimindo diferenca de dias -> " + periodo.getYears());
    }

    public static void somaQuatroAnosPeriodoAtual(){
        LocalDate olimpiadas = LocalDate.of(2022, Month.JUNE, 5);
        LocalDate proximasOlimpiadas = olimpiadas.plusYears(4);
        System.out.println("Imprimindo Data somada para mais quatro anos -> " + proximasOlimpiadas);
    }

    public static void imprimeDataFormatada(){
        LocalDate olimpiadas = LocalDate.of(2022, Month.JUNE, 5);
        LocalDate proximasOlimpiadas = olimpiadas.plusYears(4);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorfFormatado = proximasOlimpiadas.format(formatador);
        System.out.println("Imprimindo data formatada -> " + valorfFormatado);
    }


    public static void imprimeAgora(){
        LocalDateTime agora  = LocalDateTime.now();
        System.out.println("Imprimindo Data e Hora -> " + agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
    }

    public static void transformaAgoraLocalDate(){
        LocalDateTime agora  = LocalDateTime.now();
        System.out.println("Convertendo LocalDateTime para Data -> " + agora.toLocalDate());
    }

    public static void calculaDiferencaHora(){
        LocalDateTime duasHorasAtras =  LocalDateTime.now();
        duasHorasAtras.getHour();
        LocalDateTime proximaHora = duasHorasAtras.plusHours(2);


        LocalDateTime horaAtual = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("hh");
        Duration duracao = Duration.between(horaAtual, proximaHora);

        System.out.println("Calculando diferenca de Horas "+ duracao.toHours());

    }
}
