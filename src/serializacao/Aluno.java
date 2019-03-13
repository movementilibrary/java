package serializacao;

import java.io.*;

/**
 * Quando colocamos o transient estamos dizendo que o atributo nao precisa ser serializado,
 * após serializar o codigo o java gera um serialVersionUID, para ele ter certeza que a classe serializada
 * é a mesma que este sendo deserializada
 *
 * Quando temos umas associacao com outras classes precisamos inluir a imlementacao Serializable pois caso contrario
 * teremos um erro na serializacao
 */
public class Aluno implements Serializable {
        private Long id;
        private String nome;
        private transient String password;
        private String nomeEscola = "MovementiClass";


        public Aluno(Long id, String nome, String password) {
            this.id = id;
            this.nome = nome;
            this.password = password;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getNomeEscola() {
            return nomeEscola;
        }

        public void setNomeEscola(String nomeEscola) {
            this.nomeEscola = nomeEscola;
        }

        @Override
        public String toString() {
            return "Aluno{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", password='" + password + '\'' +
                    ", nomeEscola='" + nomeEscola + '\'' +
                    '}';
        }


        public static void gravadorObjeto(){
            /**
             * Serializacao é voce pegar um objeto e realizar um fluxo, ou seja passar ele por um canal de dados
             * ou seja vamos fazer um streaming de um objeto para um arquivo, para isso vamos utiliar o FileOutputStream
             * Como vamos fazer um Streaming de objetos vamos utilizar o ObjectiveOutputStream, passando no seu construtor
             * o FileOutputStream
             */
            Aluno aluno = new Aluno(1L, "Michel", "123");
            try (ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("aluno.ser"))){
                oos.writeObject(aluno);
            }catch (IOException e){
                e.printStackTrace();
            }
        }


        public static void leitorObjeto(){
            /**
             * Deserializacao
             */
            try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream("aluno.ser"))){
                Aluno alunoIn = (Aluno) ois.readObject();
                System.out.println(alunoIn);
            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }

        }
    public static void main(String[] args) {
        // gravadorObjeto();
        leitorObjeto();
    }

}
