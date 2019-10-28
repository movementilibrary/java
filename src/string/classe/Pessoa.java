package string.classe;

public class Pessoa {

    public static void main(String[] args) {
        String nome = "Michel";
        nome = nome.concat("Marciano");
        System.out.println(nome);

        String sobrenome = "Marciano";
        System.out.println(sobrenome.charAt(4));
    }
}
