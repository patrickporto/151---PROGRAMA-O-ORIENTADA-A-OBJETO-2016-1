/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megasena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author patrick.porto
 */
public class Aposta {
    private List<String> dezenas = new ArrayList<String>();
    private List<String> dezenasSorteadas = new ArrayList<String>();

    /**
     * @return the dezenas
     */
    public List<String> getDezenas() {
        return dezenas;
    }

    /**
     * @param dezenas the dezenas to set
     */
    public void setDezenas(String[] dezenas) {
        this.dezenas = Arrays.asList(dezenas);
    }
    
    public int quantAcertos() {
        return dezenasSorteadas.size();
    }

    /**
     * @return the dezenasSorteadas
     */
    public List<String> getDezenasSorteadas() {
        return dezenasSorteadas;
    }

    /**
     * @param dezenasSorteadas the dezenasSorteadas to set
     */
    public void setDezenasSorteadas(String[] dezenasSorteadas) {
        this.dezenasSorteadas = Arrays.asList(dezenasSorteadas);
    }
    
    public void addDezenaSorteada(String dezena) {
        this.dezenasSorteadas.add(dezena);
    }
    
    public boolean temDezena (String dezena) {
        return this.dezenas.indexOf(dezena) >= 0;
    }
}
