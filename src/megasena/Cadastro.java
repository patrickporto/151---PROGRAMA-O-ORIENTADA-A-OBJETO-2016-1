
package megasena;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/*
 * A classe Cadastro encapsula o conjunto de todos os apostadores cadastrados.
 */
public class Cadastro {
    private HashMap<String, Apostador> apostadores = new HashMap<>();
    /*
     *  Construtor.
     */
    public Cadastro (String nomeArqCadatro) {
        try {
            FileReader arq = new FileReader(nomeArqCadatro);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                Apostador apostador = new Apostador();
                apostador.setCPF(linha.substring(0, 11));
                apostador.setNome(linha.substring(12));
                this.apostadores.put(apostador.getCPF(), apostador);
                linha = lerArq.readLine();
            }
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
    
    public Apostador getApostador(String cpf) {
        return this.apostadores.get(cpf);
    }
}
