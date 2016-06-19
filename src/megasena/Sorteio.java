
package megasena;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * A classe Sorteio encapsula as dezenas sorteadas.
*/
public class Sorteio {
    private List<String> sorteio = new ArrayList<String>();
    /*
     *  Construtor
     */
    public Sorteio (String nomeArqSorteio) {
        try {
            FileReader arq = new FileReader(nomeArqSorteio);
            BufferedReader lerArq = new BufferedReader(arq);
            this.sorteio = Arrays.asList(lerArq.readLine().split(" "));
        } catch (Exception e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
    
    public List<String> getDezenas() {
        return this.sorteio;
    }
}
