# Jogo de Adivinhação

Este é um jogo de adivinhação desenvolvido em Java, onde o objetivo é adivinhar um número aleatório gerado pelo programa dentro de diferentes faixas, de acordo com o nível de dificuldade escolhido.

## Tecnologias Utilizadas
- Java 8+
- Scanner para entrada de dados do usuário
- Random para gerar o número aleatório

## Como Jogar
1. O jogador escolhe um nível de dificuldade:
   - **Fácil:** Números de 1 a 20, com 5 tentativas.
   - **Médio:** Números de 1 a 50, com 7 tentativas.
   - **Difícil:** Números de 1 a 50, com 4 tentativas.
   - **Impossível:** Números de 1 a 100, com 4 tentativas.
2. O programa gera um número aleatório dentro da faixa do nível escolhido.
3. O jogador deve inserir um palpite.
4. O programa informa se o palpite é maior ou menor que o número correto.
5. O jogador continua tentando até acertar o número ou esgotar suas tentativas.
6. Se o jogador acerta, uma mensagem de parabéns é exibida. Se errar todas as tentativas, o programa revela o número correto.

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

-----------------Jogo da adivinhação--------------------------
Escolha o nível do jogo:
1. Fácil
2. Médio
3. Difícil
4. Impossível
5. Sair

**Você selecionou o nível MÉDIO**
Digite um número aleatório para adivinhar o número de 1 a 50! Você tem 7 tentativas.
25
-----------Tente de novo!------------
O número é MAIOR que seu palpite
Digite seu próximo palpite:
37
Parabéns! Você acertou o número!
O número é 37
```

## Melhorias Futuras
- Criar uma interface gráfica.


Sinta-se à vontade para contribuir e sugerir melhorias! 🎯

