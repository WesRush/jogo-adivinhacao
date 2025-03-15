package org.jogo.adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numAleatorio = random.nextInt(101);
       Scanner sc = new Scanner(System.in);
        System.out.println("-----------------Jogo da advinhação--------------------------");
        System.out.println("Digite um número aleatório para adivinhar o número de  1 a 100! ");
        int palpite = sc.nextInt();

      do {
          if (palpite > numAleatorio) {
              System.out.println("-----------Tente de novo!------------");
              System.out.println("O número é MENOR que seu palpite");
              System.out.println("Digite seu próximo palpite: ");

              palpite = sc.nextInt();

          } else if (palpite < numAleatorio) {
              System.out.println("-----------Tente de novo!------------");
              System.out.println("O número é MAIOR que seu palpite");
              System.out.println("Digite seu próximo palpite: ");

              palpite = sc.nextInt();

          }

      }while (palpite != numAleatorio);
        System.out.println("Parabéns você acertou o número! ");

        System.out.println("O número é " + numAleatorio);
    }
}