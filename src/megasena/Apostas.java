
package megasena;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * A classe Apostas encapsula o conjunto de todas apostas registradas.
 */
public class Apostas {
    private HashMap<Aposta, Apostador> apostas = new HashMap<>();
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
                Aposta aposta = new Aposta();
                aposta.setDezenas(linha.substring(12).split(" "));
                this.apostas.put(aposta, apostador);
                linha = lerArq.readLine();
            }
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
    /*
     *  Verificar dezenas acertadas em cada aposta.
     */
    public void ApuraResultado (Sorteio sorteioRealizado) {
        this.apostas.forEach((Aposta aposta, Apostador apostador) -> {
            sorteioRealizado.getDezenas().forEach((dezena) -> {
                boolean acertou = aposta.temDezena(dezena);
                if (acertou) {
                    aposta.addDezenaSorteada(dezena);
                }
            });
        });
    }
    /*
     *  Gera arquivo texto com os resultados de todas as apostas.  
     */
    public void SalvaResultado (String nomeArqResultado) {
        try {
            FileWriter arq = new FileWriter(new File(nomeArqResultado));
            arq.write("-------------------------------------------------");
            arq.write(System.lineSeparator());
            arq.write("     R E S U L T A D O D A M E G A S E N A       ");
            arq.write(System.lineSeparator());
            arq.write("-------------------------------------------------");
            arq.write(System.lineSeparator());
            this.apostas.forEach((Aposta aposta, Apostador apostador) -> {
                try {
                    arq.write("Apostador: " + apostador.getNome());
                    arq.write(System.lineSeparator());
                    arq.write("Acertou " + aposta.quantAcertos() + " dezenas.");
                    arq.write(System.lineSeparator());
                    if (aposta.quantAcertos() > 0) {
                        arq.write(String.join(" ", aposta.getDezenasSorteadas()));
                        arq.write(System.lineSeparator());
                    }
                    arq.write("-------------------------------------------------");
                    arq.write(System.lineSeparator());
                } catch (IOException e) {
                    System.err.printf("Erro na escrita do arquivo: %s.\n", e.getMessage());
                }
            });
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na escrita do arquivo: %s.\n", e.getMessage());
        }
    }
}
