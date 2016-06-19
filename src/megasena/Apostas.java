
package megasena;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/*
 * A classe Apostas encapsula o conjunto de todas apostas registradas.
 */
public class Apostas {
    private HashMap<String, Apostador> apostas = new HashMap<>();
    /*
     *  Construtor
     */
    public Apostas (String nomeArqApostas, Cadastro cadApostadores) {
        try {
            FileReader arq = new FileReader(nomeArqApostas);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                Apostador apostador = cadApostadores.getApostador(linha.substring(0, 11));
                this.apostas.put(linha.substring(12), apostador);
                linha = lerArq.readLine();
            }
        } catch (Exception e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
    /*
     *  Verificar dezenas acertadas em cada aposta.
     */
    public void ApuraResultado (Sorteio sorteioRealizado) {
        // Completar...
    }
    /*
     *  Gera arquivo texto com os resultados de todas as apostas.  
     */
    public void SalvaResultado (String nomeArqResultado) {
        // Completar...
    }
}
