package string.classe;

public class Pessoa {

    public static void main(String[] args) {
        String nome = "   Michel   ";
        nome = nome.concat("   Marciano   ");
        System.out.println(nome);

        String sobrenome = "Marciano";
        System.out.println(sobrenome.charAt(1));

        System.out.println(nome.equals("MichelMarciano"));

        System.out.println(nome.equalsIgnoreCase("michelmarciano"));

        System.out.println(nome.length());

        System.out.println(nome.replace('i', '@'));

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(0,2));
        System.out.println(nome.trim());
    }
}
