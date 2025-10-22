import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Executavel {
    public static Scanner SC = new Scanner(System.in);
    public static Jogador jogador = new Jogador();
    public static void main(String[] args) {
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
                int escolha = SC.nextInt();
                switch (escolha) {
                    case 1 : {
                        escreverMensagem("Essa corda é muito pequena. Não foi possível abrir a porta", 50);
                        break;
                    }
                    case 2 : {
                        escreverMensagem("Essa corda é perfeita. Você puxa a alavanca e a porta se abre", 50);
                        break;
                    }
                    case 3 : {
                        escreverMensagem("Essa corda é muito grande e acaba ficando frouxa quando você tenta puxá-la, não sendo possível abrir a porta", 50);
                        break;
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