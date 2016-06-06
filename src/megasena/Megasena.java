
package megasena;

/**
 *
 * @authors: APENAS NO ARQUIVO Megasena.java!!!!!
 * 
 * Nome completo 1: xxx
 * Nome completo 2: xxx
 * Nome completo 3: xxx
 * ...
 */
public class Megasena {

    public static void main(String[] args) {
        
        Cadastro    cadastro = new Cadastro ("cadastro.txt");
        Apostas     apostas  = new Apostas  ("apostas.txt", cadastro);
        Sorteio     sorteio  = new Sorteio  ("sorteio.txt");
        
        apostas.ApuraResultado (sorteio);
        apostas.SalvaResultado ("resultado.txt");
        
    }
    
}
