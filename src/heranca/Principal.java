package heranca;

public class Principal {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Michel Oliveira Marciano");
        g1.setCpf("32201635803");
        g1.setSalario(100.00);

        System.out.println("Nome: " + g1.getNome() +
                            " \nCPF: " + g1.getCpf() +
                            " \nSalario: " + g1.getSalario());

        boolean autentica = g1.autentica(1234);
        System.out.println(autentica);
    }
}
