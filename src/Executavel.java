import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Executavel {

    public static Scanner SC = new Scanner(System.in);
    public static Jogador jogador = new Jogador();

    public static void main(String[] args) {
        int resposta = 0;
        while (true) {
            try {
                escreverMensagem("Você é um aventureiro que recebeu uma missão: explorar uma masmorra encontrada no deserto.\n", 50);
                escreverMensagem("Você está se aproximando da masmorra, enquanto anseia pela aventura.\n", 50);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        escreverMensagem(".", 200);
                    }
                    System.out.println();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
                escreverMensagem("Qual o seu nome, aventureiro?\n", 50);
                Jogador.setNome(SC.nextLine());
                escreverMensagem("Você chegou.\n", 50);
                escreverMensagem("Na porta da masmorra, uma placa é notável.\n", 50);
                escreverMensagem("Ao se aproimar cerca de 5 metros, você vê que está escrito: \"Masmorra do Matemágico\".\n", 50);
                escreverMensagem("\"Matemágico? Quem é Matemágico?\", você pensa\n", 50);
                escreverMensagem("Você decide ignorar por enquanto\n", 50);
                escreverMensagem("Ao andar em direção à porta, que mede 3 metros de altura, e tentar abri-lá, você percebe que ela está trancada.\n", 50);
                escreverMensagem("Olhando para cima, você vê uma alavanca, percebendo que ela pode abrir a porta.\n", 50);
                while (resposta != 2) {
                    try {
                        escreverMensagem("Na sua mochila, há três cordas:\n", 50);
                        int i = 1;
                        for (Item item : Jogador.getInventario()) {
                            if (item.getNome().contains("Corda ")) {
                                escreverMensagem("\n" + i + " - " + item.getNome() + ": ", 50);
                                escreverMensagem(item.getDescricao() + "\n", 50);
                                i++;
                            }
                        }
                        escreverMensagem("Qual a melhor corda para puxar a alavanca, considerando que você está a 4 metros da porta?\n", 50);
                        resposta = SC.nextInt();
                        switch (resposta) {
                            case 1: {
                                escreverMensagem("Essa corda é muito pequena. Não foi possível abrir a porta", 50);
                                break;
                            }
                            case 2: {
                                escreverMensagem("Essa corda é perfeita. Você puxa a alavanca e a porta se abre", 50);
                                break;
                            }
                            case 3: {
                                escreverMensagem("Essa corda é muito grande e acaba ficando frouxa quando você tenta puxá-la, não sendo possível abrir a porta", 50);
                                break;
                            }
                        }
                    }
                    catch (InputMismatchException e) {
                        escreverMensagem("Opção Inválida", 50);
                    }
                }
                escreverMensagem("Entrando na masmorra, ela é escura. Imediatamente, você acende sua lamparina", 50);
                escreverMensagem("As sombras dançam nas paredes enquanto você anda, descendo escadas e finalmente chegando em uma sala, diante de uma porta", 50);
                escreverMensagem(Jogador.getNome() + ", você desceu pelas escadas, que espiralavam.\n", 50);
                try {
                    escreverMensagem("Cada descida era feita com uma curva de 90 graus, fazendo você dar 3/2 voltas.\n", 50);
                    escreverMensagem("Quantas escadas você desceu?\n", 50);
                    resposta = SC.nextInt();
                    while (resposta != 6) {
                        escreverMensagem("Resposta errada", 50);
                    }
                } catch (InputMismatchException e) {
                    escreverMensagem("Opção Inválida", 50);
                }
                escreverMensagem("Ótimo, " + Jogador.getNome() + ".\n", 50);
                escreverMensagem("Um barulho ecoa pela escuridão...", 50);
                while (resposta != 12) {
                    escreverMensagem("Das sombras, várias figuras estranhas surgem. Elas são verdes e pequenas. São goblins'\n", 25);
                    escreverMensagem("Essas criaturas estão ordenadas em fileiras, de forma coordenada. São 3 filas com 4 goblins em cada fila!\n", 25);
                    try {
                        escreverMensagem("Quantos golpes você deve desferir com sua espada para poder vencer esta batalha, considerando que cada goblin morrerá com 2 golpes?\n", 50);
                        resposta = SC.nextInt();
                        if (resposta != 12) {
                            escreverMensagem("Errado, " + resposta + " não é a quantidade de golpes", 50);
                        }
                    } catch (InputMismatchException e) {
                        escreverMensagem("Opção Inválida", 50);
                    }
                }
                escreverMensagem("Perfeito!", 50);
                escreverMensagem("Espera um pouco...", 50);
                while (resposta != 24) {
                    escreverMensagem("A quantidade de golpes que você desferiu não foram 24, como deveria ser. Foram apenas 22.\n", 50);
                    escreverMensagem("Isso significa que um dos goblins fugiu\n", 50);
                    escreverMensagem("Das sombras, um último goblin pula em você. Ele é igual aos outros. Quantos golpes você deve desferir para terminar o combate?\n", 50);
                    try {
                        resposta = SC.nextInt();
                        if (resposta != 22) {

                        }
                    }
                }
            } catch (InputMismatchException e) {

            }
        }
    }

    public static void escreverMensagem(String texto, long descanso) {
        for (char caracter : texto.toCharArray()) {
            System.err.print(caracter);
            System.err.flush();
            try {
                Thread.sleep(descanso);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*Se você perceber, todos os desafios seguem a seguinte estrurua:
* escreverMensagem(parabenização pelo desafio anterior)
* escreverMensagem(contextualização do próximo desafio)
* while (resposta != respostaCorreta)
* escreverMensagem(informações matemáticas do problema)
* escreverMensagem(pergunta)
* try
* resposta do usuário
* if (resposta != respostaCorreta) informar que errou
* catch (InputMismatchExeption e){
* escreverMensagem("Opção Inválida")
* */