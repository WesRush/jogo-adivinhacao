package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------Jogo da advinhação--------------------------");


        int level;
        System.out.println("Escolha o nível do jogo:\n1.Fácil\n2.Médio\n3.Difícil\n4.Impossível\n5.Sair");
        level = sc.nextInt();
        switch (level) {
            case 1:

                System.out.println("**Você selecionou o nível FÁCIL**");
                int tentativas1;
                int numLevel1 = random.nextInt(21);
                int palpite1;
                for (tentativas1 = 5; tentativas1 > 0; tentativas1--) {


                    System.out.println("Digite um número aleatório para adivinhar o número de  1 a 20! Você tem " + tentativas1 + " tentativas");
                    palpite1 = sc.nextInt();
                    if (palpite1 == numLevel1) {
                        System.out.println("-----------Parabéns Você Ganhou!------------");
                        System.out.println("Você ganhou! O número certo era: " + numLevel1);
                        break;
                    } else if (palpite1 != numLevel1 && tentativas1 == 1) {
                        System.out.println("-----------Que pena, você perdeu!------------");
                        System.out.println("O número certo era: " + numLevel1);
                    } else if (palpite1 > numLevel1) {
                        System.out.println("-----------Tente de novo!------------");
                        System.out.println("O número é MENOR que seu palpite");
                    } else if (palpite1 < numLevel1) {
                        System.out.println("-----------Tente de novo!------------");
                        System.out.println("O número é MAIOR que seu palpite");
                    }

                }
                break;

            case 2:
                System.out.println("**Você selecionou o nível MÉDIO**");
                int tentativas2;
                int numLevel2 = random.nextInt(51);
                for (tentativas2 = 7; tentativas2 > 0; tentativas2--) {
                    int palpite2;

                    System.out.println("Digite um número aleatório para adivinhar o número de  1 a 50! Você tem " + tentativas2 + " tentativas");
                    palpite2 = sc.nextInt();
                    if (palpite2 == numLevel2) {
                        System.out.println("-----------Parabéns Você Ganhou!------------");
                        System.out.println("Você ganhou! O número certo era: " + numLevel2);
                        break;
                    } else if (palpite2 != numLevel2 && tentativas2 == 1) {
                        System.out.println("-----------Que pena, você perdeu!------------");
                        System.out.println("O número certo era: " + numLevel2);
                    } else if (palpite2 > numLevel2) {
                        System.out.println("-----------Tente de novo!------------");
                        System.out.println("O número é MENOR que seu palpite");
                    } else if (palpite2 < numLevel2) {
                        System.out.println("-----------Tente de novo!------------");
                        System.out.println("O número é MAIOR que seu palpite");
                    }


                }
                break;
            case 3:
                System.out.println("**Você selecionou o nível DIFÍCIL**");
                int tentativas3;
                int numLevel3 = random.nextInt(51);
                for (tentativas3 = 4; tentativas3 > 0; tentativas3--) {
                    int palpite3;

                    System.out.println("Digite um número aleatório para adivinhar o número de  1 a 50! Você tem " + tentativas3 + " tentativas");
                    palpite3 = sc.nextInt();
                    if (palpite3== numLevel3) {
                        System.out.println("-----------Parabéns Você Ganhou!------------");
                        System.out.println("Você ganhou! O número certo era: " + numLevel3);
                        break;
                    } else if (palpite3 != numLevel3 && tentativas3== 1) {
                        System.out.println("-----------Que pena, você perdeu!------------");
                        System.out.println("O número certo era: " + numLevel3);
                    } else if (palpite3 > numLevel3) {
                        System.out.println("-----------Tente de novo!------------");
                        System.out.println("O número é MENOR que seu palpite");
                    } else if (palpite3 < numLevel3) {
                        System.out.println("-----------Tente de novo!------------");
                        System.out.println("O número é MAIOR que seu palpite");
                    }

                }
                break;
            case 4:
                System.out.println("**Você selecionou o nível DIFÍCIL**");
                int tentativas4;
                int numLevel4 = random.nextInt(101);
                for (tentativas4 = 4; tentativas4 > 0; tentativas4--) {
                    int palpite4;

                    System.out.println("Digite um número aleatório para adivinhar o número de  1 a 100! Você tem " + tentativas4 + " tentativas");
                    palpite4 = sc.nextInt();
                    if (palpite4== numLevel4) {
                        System.out.println("-----------Parabéns Você Ganhou!------------");
                        System.out.println("Você ganhou! O número certo era: " + numLevel4);
                        break;
                    } else if (palpite4 != numLevel4 && tentativas4== 1) {
                        System.out.println("-----------Que pena, você perdeu!------------");
                        System.out.println("O número certo era: " + numLevel4);
                    } else if (palpite4 > numLevel4) {
                        System.out.println("-----------Tente de novo!------------");
                        System.out.println("O número é MENOR que seu palpite");
                    } else if (palpite4 < numLevel4) {
                        System.out.println("-----------Tente de novo!------------");
                        System.out.println("O número é MAIOR que seu palpite");
                    }

                }
                break;
            default:
                System.out.println("----------- Jogo encerrado! --------------");
        }
    }
}






