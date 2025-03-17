# Jogo de Adivinhação

Este é um simples jogo de adivinhação desenvolvido em Java. O objetivo é adivinhar um número aleatório entre 1 e 100 gerado pelo programa.

## Tecnologias Utilizadas
- Java 8+
- Scanner para entrada de dados do usuário
- Random para gerar o número aleatório

## Como Jogar
1. O programa gera um número aleatório entre 1 e 100.
2. O jogador deve inserir um palpite.
3. O programa informa se o palpite é maior ou menor que o número correto.
4. O jogador continua tentando até acertar o número.
5. Quando o jogador acerta, o programa exibe uma mensagem de parabéns e finaliza.

## Como Executar o Jogo
1. Certifique-se de ter o [Java](https://www.java.com/pt-BR/) instalado em sua máquina.
2. Copie o código abaixo e salve como `Main.java` dentro de um diretório de sua escolha.
3. Abra um terminal ou prompt de comando e navegue até o diretório onde o arquivo `Main.java` está salvo.
4. Compile o código com o comando:
   ```sh
   javac Main.java
   ```
5. Execute o programa com o comando:
   ```sh
   java Main
   ```

## Exemplo de Execução
```
-----------------Jogo da advinhação--------------------------
Digite um número aleatório para adivinhar o número de  1 a 20! Você tem 5 tentativas
1
-----------Tente de novo!------------
O número é MAIOR que seu palpite
Digite um número aleatório para adivinhar o número de  1 a 20! Você tem 4 tentativas
20
-----------Tente de novo!------------
O número é MENOR que seu palpite
Digite um número aleatório para adivinhar o número de  1 a 20! Você tem 3 tentativas
15
-----------Tente de novo!------------
O número é MAIOR que seu palpite
Digite um número aleatório para adivinhar o número de  1 a 20! Você tem 2 tentativas
18
-----------Tente de novo!------------
O número é MENOR que seu palpite
Digite um número aleatório para adivinhar o número de  1 a 20! Você tem 1 tentativas
17
-----------Que pena, você perdeu!------------
O número certo era: 16
```

## Melhorias Futuras
- Implementar limite de tentativas. (Aplicado)
- Adicionar níveis de dificuldade.
- Criar uma interface gráfica.

Sinta-se à vontade para contribuir e sugerir melhorias! 🎯

