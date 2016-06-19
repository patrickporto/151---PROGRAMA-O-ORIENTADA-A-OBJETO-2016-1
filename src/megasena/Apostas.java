
package megasena;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

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
        System.out.println("-------------------------------------------------");
        System.out.println("     R E S U L T A D O D A M E G A S E N A       ");
        System.out.println("-------------------------------------------------");
        this.apostas.forEach((Aposta aposta, Apostador apostador) -> {
            System.out.println("Apostador: " + apostador.getNome());
            System.out.println("Acertou " + aposta.quantAcertos()+ " dezenas.");
            System.out.println(String.join(" ", aposta.getDezenasSorteadas()));
            System.out.println("-------------------------------------------------");
        });
    }
}
