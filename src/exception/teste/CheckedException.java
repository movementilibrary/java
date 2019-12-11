package exception.teste;

import java.io.File;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        criarArquivo();

    }

    public static void criarArquivo() {
        File file = new File("Teste.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
