package array.classe;

import java.util.Objects;

public class Produto implements Comparable<Produto>{

    private String serialNumber;
    private String nome;
    private Double preco;

    public Produto(String serialNumber, String nome, double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return serialNumber.equals(produto.serialNumber) &&
                nome.equals(produto.nome) &&
                preco.equals(produto.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, nome, preco);
    }


    @Override
    public int compareTo(Produto produto) {
        return this.nome.compareTo(produto.nome);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber='" + serialNumber + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
