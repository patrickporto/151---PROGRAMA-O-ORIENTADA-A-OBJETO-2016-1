/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megasena;


/**
 *
 * @author patrick.porto
 */
public class Apostador {
    private String nome;
    private String cpf;
    private String[] aposta;
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the aposta
     */
    public String[] getAposta() {
        return aposta;
    }

    /**
     * @param aposta the aposta to set
     */
    public void setAposta(String[] aposta) {
        this.aposta = aposta;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s", this.cpf, this.nome);
    }
}
