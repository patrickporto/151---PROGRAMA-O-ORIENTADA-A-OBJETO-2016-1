
package megasena;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * A classe Apostas encapsula o conjunto de todas apostas registradas.
 */
public class Apostas {
    /*
     *  Construtor
     */
    public Apostas (String nomeArqApostas, Cadastro cadApostadores) {
        try {
            FileReader arq = new FileReader(nomeArqApostas);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {;
                Apostador apostador = cadApostadores.getApostador(linha.substring(0, 11));
                apostador.setAposta(linha.substring(12).split(" "));
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
