## Instruções básicas  ##
O objetivo do trabalho é programar a apuração do sorteio da Megasena.
* Seu projeto deverá se chamar, obrigatoriamente, Megasena. Portanto, esta classe principal, contento o
método main, será implementada no arquivo Megasena.java.
* Os nomes completos dos integrantes do grupo estarão do cabeçalho da classe principal Megasena, e
SOMENTE neste arquivo.
* A classe Megasena deve seguir o formato do modelo ilustrado no final deste texto.
* Todos os projetos entregues deverão ser implementados no Netbeans.
* Somente aceitarei os trabalhos que foram realizados sob tais condições.

Seu programa deve ler os arquivos com dados dos apostadores e suas apostas, bem como o sorteio
realizado. Depois de processar as informações, uma saída será gerada, contendo o resultado do sorteio. Os
arquivos terão, obrigatoriamente, os nomes a seguir:
* Arquivo cadastro.txt: arquivo de entrada, com dados dos apostadores.
Cada linha deste arquivo contém o CPF e o nome completo de um apostador, todos NA MESMA LINHA.
* Arquivo apostas.txt: arquivo de entrada, com dados das apostas.
Cada linha deste arquivo contém o CPF do apostador (previamente incluído no cadastro).
NA MESMA LINHA segue-se uma lista contendo entre seis e dez dezenas apostadas por ele. Um
apostador fará no máximo uma aposta; ou seja, não teremos duas apostas com o mesmo CPF.
* Arquivo sorteio.txt: arquivo de entrada, com dados do sorteio realizado.
Este arquivo contém uma única linha, contendo as seis dezenas sorteadas.
* Arquivo resultado.txt: arquivo de saída, com os dados da apuração do sorteio realizado.
Este arquivo contém o nome completo de cada apostador, quantas e quais dezenas ele acertou.

## Testes de saída do programa  ##
Veja os exemplos abaixo, e teste o seu programa para que produza o arquivo ilustrado mais adiante.

**cadastro.txt**
```
11111111122 Sortudo da Sorte
11122233344 Azarado de Mais
12345678901 Fulano de Tal
99999999999 Ultimo dos Moicanos
```

**apostas.txt**
```
11122233344 11 12 13 14 15 16 17 18 19
11111111122 01 02 03 40 50 60
99999999999 10 09 08 07 05 04 03 02 01
12345678901 10 20 30 40 50 60
```

**sorteio.txt**
```
60 50 40 01 02 03
```

**resultado.txt**
```
-------------------------------------------------
R E S U L T A D O D A M E G A S E N A
-------------------------------------------------
Apostador: Azarado de Mais
Acertou 0 dezenas.
-------------------------------------------------
Apostador: Sortudo da Sorte
Acertou 6 dezenas.
60 50 40 01 02 03
-------------------------------------------------
Apostador: Ultimo dos Moicanos
Acertou 3 dezenas.
01 02 03
-------------------------------------------------
Apostador: Fulano de Tal
Acertou 3 dezenas.
60 50 40
-------------------------------------------------
```
