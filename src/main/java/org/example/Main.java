package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int palpite;
        int numAleatorio = random.nextInt(21);
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------Jogo da advinhação--------------------------");

        int tentativas;
        for (tentativas = 5; tentativas > 0; tentativas--) {
            System.out.println("Digite um número aleatório para adivinhar o número de  1 a 20! Você tem " + tentativas + " tentativas");
            palpite = sc.nextInt();
            if (palpite == numAleatorio) {
                System.out.println("-----------Parabéns Você Ganhou!------------");
                System.out.println("Você ganhou! O número certo era: " + numAleatorio);
                break;
            }else if (palpite != numAleatorio && tentativas == 1){
                System.out.println("-----------Que pena, você perdeu!------------");
                System.out.println("O número certo era: " + numAleatorio);
            } else if (palpite > numAleatorio) {
                System.out.println("-----------Tente de novo!------------");
                System.out.println("O número é MENOR que seu palpite");
            } else if (palpite < numAleatorio) {
                System.out.println("-----------Tente de novo!------------");
                System.out.println("O número é MAIOR que seu palpite");
            }

        }
    }
}







//        do {
//        if (palpite > numAleatorio) {
//        System.out.println("-----------Tente de novo!------------");
//                    System.out.println("O número é MENOR que seu palpite");
//                    System.out.println("Digite seu próximo palpite: ");
//
//palpite = sc.nextInt();
//
//                } else if (palpite < numAleatorio) {
//        System.out.println("-----------Tente de novo!------------");
//                    System.out.println("O número é MAIOR que seu palpite");
//                    System.out.println("Digite seu próximo palpite: ");
//
//palpite = sc.nextInt();
//
//                }