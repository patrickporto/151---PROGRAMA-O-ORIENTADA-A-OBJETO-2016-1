
package megasena;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * A classe Sorteio encapsula as dezenas sorteadas.
*/
public class Sorteio {
    private String sorteio;
    /*
     *  Construtor
     */
    public Sorteio (String nomeArqSorteio) {
        try {
            FileReader arq = new FileReader(nomeArqSorteio);
            BufferedReader lerArq = new BufferedReader(arq);
            String sorteio = lerArq.readLine();
        } catch (Exception e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
    
}
