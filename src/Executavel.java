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
                escreverMensagem("Ao se aproximar cerca de 5 metros, você vê que está escrito: \"Masmorra do Matemágico\".\n", 50);
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
                                escreverMensagem(i + " - " + item.getNome() + ": ", 50);
                                escreverMensagem(item.getDescricao() + "\n", 50);
                                i++;
                            }
                        }
                        escreverMensagem("Qual a melhor corda para puxar a alavanca, considerando que você está a 4 metros da porta?\n", 50);
                        resposta = SC.nextInt();
                        switch (resposta) {
                            case 1: {
                                escreverMensagem("Essa corda é muito pequena. Não foi possível abrir a porta\n", 50);
                                break;
                            }
                            case 2: {
                                escreverMensagem("Essa corda é perfeita. Você puxa a alavanca e a porta se abre\n", 50);
                                break;
                            }
                            case 3: {
                                escreverMensagem("Essa corda é muito grande e acaba ficando frouxa quando você tenta puxá-la, não sendo possível abrir a porta\n", 50);
                                break;
                            }
                            default : {
                                escreverMensagem("Essa não é uma corda existente\n", 50);
                            }
                        }
                    }
                    catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção Inválida\n", 50);
                    }
                }
                escreverMensagem("Entrando na masmorra, ela é escura. Imediatamente, você acende sua lamparina\n", 50);
                escreverMensagem("As sombras dançam nas paredes enquanto você anda, descendo escadas e finalmente chegando em uma sala, diante de uma porta\n", 50);
                escreverMensagem(Jogador.getNome() + ", você desceu pelas escadas, que espiralavam.\n", 50);
                while (resposta != 6) {
                    try {
                        escreverMensagem("Cada descida era feita com uma curva de 90 graus, fazendo você dar 3/2 voltas.\n", 50);
                        escreverMensagem("Quantas escadas você desceu?\n", 50);
                        resposta = SC.nextInt();
                        if (resposta != 6) {
                            escreverMensagem("Resposta errada\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção Inválida\n", 50);
                    }
                }
                escreverMensagem("Ótimo, " + Jogador.getNome() + ".\n", 50);
                escreverMensagem("Um barulho ecoa pela escuridão...\n", 50);
                while (resposta != 24) {
                    escreverMensagem("Das sombras, várias figuras estranhas surgem. Elas são verdes e pequenas. São goblins'\n", 25);
                    escreverMensagem("Essas criaturas estão ordenadas em fileiras, de forma coordenada. São 3 filas com 4 goblins em cada fila!\n", 25);
                    try {
                        escreverMensagem("Quantos golpes você deve desferir com sua espada para poder vencer esta batalha, considerando que cada goblin morrerá com 2 golpes?\n", 50);
                        resposta = SC.nextInt();
                        if (resposta != 24) {
                            escreverMensagem("Errado, " + resposta + " não é a quantidade de golpes\n", 50);
                            Jogador.diminuirVida(1);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção Inválida\n", 50);
                    }
                }
                escreverMensagem("Perfeito!\n", 50);
                escreverMensagem("Espera um pouco...", 50);
                while (resposta != 2) {
                    escreverMensagem("A quantidade de golpes que você desferiu não foram 24, como deveria ser. Foram apenas 22.\n", 50);
                    escreverMensagem("Isso significa que um dos goblins fugiu\n", 50);
                    escreverMensagem("Das sombras, um último goblin pula em você. Ele é igual aos outros. Quantos golpes você deve desferir para terminar o combate?\n", 50);
                    try {
                        resposta = SC.nextInt();
                        if (resposta != 2) {
                            escreverMensagem("Errado. Você só precisa desferir 2 golpes para finalizar o combate.\n", 50);
                            Jogador.diminuirVida(1);
                        } else {
                            escreverMensagem("Exatamente. A quantidade de golpes restantes era 2.\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção Inválida\n", 50);
                    }
                }
                escreverMensagem("Ao desferir os 2 golpes restantes, você finalmente derrota os goblins.\n", 50);
                escreverMensagem("No chão, uma carta é possível ser vista.\n", 50);
                while (resposta != 4) {
                    escreverMensagem("""
                        Nela, está escrito:
                        \"Na masmorra, 12 salas há de se encontrar
                        Cada uma com um desafio para superar
                        Em 3 andares, sua dúvida deve sanar
                        Mas cuidado para não se desesperar\"
                        """, 50);
                    escreverMensagem("A carta diz que há 12 salas divididas em 3 andares...\n", 50);
                    escreverMensagem("Quantas salas há por andar?\n", 50);
                    try {
                        resposta = SC.nextInt();
                        if (resposta != 4) {
                            escreverMensagem("Acho que essa não é a resposta certa, " + Jogador.getNome() + "...\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção Inválida\n", 50);
                    }
                }
                while (resposta != 25) {
                    try {
                        escreverMensagem("4 salas por andar. Isso é um número interessante.\n", 50);
                        escreverMensagem("Isso ainda parece misterioso, ainda mais com a carta dizendo que devemos sanar nossas dúvidas.\n", 50);
                        escreverMensagem("Provavelmente deve haver pelo menos 1 resposta para nossas dúvidas em cada andar. Qual a chance de uma sala aleatória desse andar conter essa resposta, sabendo que temos 4 salas nesse andar? (Escreva em números inteiros. Ex: '0' para 0% ou '100' para 100%\n", 50);
                        resposta = SC.nextInt();
                        if (resposta != 25) {
                            escreverMensagem("Essa não parece ser a resposta correta...\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }
                escreverMensagem("Não temos mais tempo a perder, devemos começar a explorar logo.\n", 50);
                escreverMensagem("ANDAR 1 - SALA 1\n", 50);
                while (resposta != 27) {
                    try {
                        escreverMensagem("Essa sala é gosmenta, e pequenas criaturas gelatinosas percorrem por ela\n", 50);
                        escreverMensagem("A cada 30 segundos, parece que elas se dividem em mais, triplicando o número de gosmas\n", 50);
                        escreverMensagem("Na sala, temos inicialmente 3 gosmas. Em 1 minuto, quantas gosmas teremos no total?\n", 50);
                        resposta = SC.nextInt();
                        if (resposta != 27) {
                            escreverMensagem("Acho que esse não seja o número correto...\n", 50);
                            Jogador.diminuirVida(2);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção Inválida\n", 50);
                    }
                }
                escreverMensagem("Exatamente, 27 gosmas. Parabéns, "+ Jogador.getNome() + ". E você desfere os golpes para matar essas gosmas. A sala está vazia\n", 50);
                escreverMensagem("ANDAR 1 - SALA 2\n", 50);
                while (resposta != 20) {
                    try {
                        escreverMensagem("Um mapa está colado na parede dessa sala. E parece mostrar um mapa da masmorra. \nÓtimo.\nCom isso, você pode descobrir o quão grande a masmorra é\n", 50);
                        escreverMensagem("O mapa diz que a masmorra possui 400 metros quadrados. Isso é muita coisa, e ela parece ser um quadrado\n", 50);
                        escreverMensagem("Se você souber o tamanho de cada lado da masmorra, poderá saber se locomover melhor por ela\n", 50);
                        escreverMensagem("Sabendo que a masmorra tem 400 metros quadrados, qual deve ser o tamanho de um dos seus lados?\n", 50);
                        resposta = SC.nextInt();
                        if (resposta != 20) {
                            escreverMensagem("Então masmorra não deve ser tão pequena, " + Jogador.getNome() + ".\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }
                escreverMensagem("ANDAR 1 - SALA 3\n", 50);
                while (resposta != 80) {
                    try {
                        escreverMensagem("""
                                               Em uma coleção de 20 gemas, exatamente 20% são imitações. 
                                               Se uma pessoa seleciona um subconjunto de 4 dessas gemas ao acaso, qual é o número médio (esperado) de imitações que ela encontrará nessa seleção (digite 0 para 0% e 100 para 100%, por exemplo)?
                                               """, 50);
                        resposta = SC.nextInt();
                        if (resposta != 80) {
                            escreverMensagem("Pense na proporção de falsas: 4 entre 20.\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }
                escreverMensagem("ANDAR 1 - SALA 4\n", 50);
                while (resposta != 2) {
                    try {
                        escreverMensagem("""
                                               Em uma tábua, há números: 2, 4, 6, 8.
                                               Qual é o desvio padrão desses números (arredondado para baixo)?
                                               """, 50);
                        resposta = SC.nextInt();
                        if (resposta != 2) {
                            escreverMensagem("Revise o cálculo da média e do desvio padrão.\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }

                escreverMensagem("As portas se abrem, permitindo que você desca para o próximo andar\n", 50);
                escreverMensagem("ANDAR 2 - SALA 1\n", 50);
                while (resposta != 0) {
                    try {
                        escreverMensagem("""
                                               Um enigma está gravado na parede:
                                               'Para abrir a porta, é necessário que A OU B sejam verdadeiros,
                                               mas não ambos ao mesmo tempo.'
                                               Se A = verdadeiro e B = verdadeiro, o portão abrirá (1 para Sim, 0 para Não)?
                                               """, 50);
                        resposta = SC.nextInt();
                        if (resposta != 0) {
                            escreverMensagem("Pense na operação lógica OU exclusivo (XOR).\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }

                escreverMensagem("ANDAR 2 - SALA 2\n", 50);
                while (resposta != 100) {
                    try {
                        escreverMensagem("""
                                               Um conjunto de dados: 10, 12, 11, 9, 100.
                                               Qual número é o outlier?
                                               """, 50);
                        resposta = SC.nextInt();
                        if (resposta != 100) {
                            escreverMensagem("Observe qual número foge do padrão.\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }
                escreverMensagem("ANDAR 2 - SALA 3\n", 50);
                while (resposta != 3) {
                    try {
                        escreverMensagem("""
                                               Você entra em uma sala iluminada por tochas flutuantes. 
                                               No centro, há uma mesa com várias pequenas poções coloridas
                                               cada cor representa um tipo de criatura que vive na masmorra.
                                   
                                               Uma voz ecoa nas paredes:
                                               "Amostragem é essencial para entender o todo sem precisar ver tudo.
                                               Escolha bem sua estratégia, aventureiro, pois o erro pode ser fatal."
                                   
                                               Um pergaminho surge diante de você com a seguinte questão:
                                               'Um pesquisador deseja estudar os aventureiros da masmorra.
                                               Ele decide dividir os aventureiros em grupos conforme suas classes
                                               (guerreiros, magos e arqueiros) e, então, sortear alguns nomes de cada grupo
                                               proporcionalmente ao tamanho deles.'
                                   
                                               Que tipo de amostragem está sendo usada?"
                                   
                                               1 - Amostragem Aleatória Simples
                                               2 - Amostragem Sistemática
                                               3 - Amostragem Estratificada
                                               4 - Amostragem por Conglomerados
                                               """, 25);
                        escreverMensagem("\nDigite o número da opção correta: ", 25);
                        resposta = SC.nextInt();
                        if (resposta != 3) {
                            escreverMensagem("""
                                                   A voz ri em eco: 
                                                   "Errado... Nem todos os grupos foram formados ao acaso, 
                                                   aventureiro. Pense: há subdivisões e sorteio dentro delas."
                                                   """, 50);
                            Jogador.diminuirVida(1);
                        } else {
                            escreverMensagem("""
                                                   A voz responde em tom satisfeito:
                                                   "Correto. Quando há divisão por grupos homogêneos, 
                                                   e sorteio dentro de cada grupo, chamamos isso de amostragem estratificada."
                                                   """, 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção inválida. Tente novamente.\n", 50);
                    }
                }
                escreverMensagem("ANDAR 2 - SALA 4\n", 50);
                while (resposta != 7) {
                    try {
                        escreverMensagem("""
                    A sala contém apenas um único item no centro dela: um pedaço rasgado de papel, que diz:
                    \"Presumo que os meus lacaios estejam tramando algo contra mim.
                    Cada dia que passo, vejo que alguns deles estão em grupos, conversando algo que dizem que nem mesmo eu posso saber
                    Nos 5 dias que fiz essa vistoria, encontrei, respectivamente, 6, 12, 4, 7 e 6 deles conversando\"\n""", 50);
                        escreverMensagem("Presumo que seja o \"Matemágico\" que escreveu isso. Em média, quantos lacaios será que estão tramando contra ele?\n", 50);
                        resposta = SC.nextInt();
                        if (resposta != 7) {
                            escreverMensagem("Acho que essa não seja a resposta correta...\nTalvez você tenha usado o método errado\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }
                escreverMensagem("As portas se abrem, permitindo que você desca para o próximo andar\n", 50);
                escreverMensagem("ANDAR 3 - SALA 1\n", 50);
                try {
                    escreverMensagem("Ao entrar na sala, um click é ouvido...\n", 50);
                    escreverMensagem("Mas não deve ser nada importante.\n", 50);
                    escreverMensagem("Ao vagar por um período irrelevante de tempo, é perceptível que a sala é triangular, como um triângulo retângulo de com hipotenusa de 6 metros\n", 50);
                    escreverMensagem("De repente, uma enorme bola começa a rolar. Não se sabe de onde, mas deve ter sido efeito do click de mais cedo. Aquilo deve ter sido um botão\n", 50);
                    escreverMensagem("Você começa a correr, sendo obrigado a fazer curvas. Você está no começo do lado que você desconhece o tamanho e deve realizar uma curva de 60 graus ao fim dele para poder fugir da bola.\n", 50);
                    escreverMensagem("Qual o comprimento desse lado?\n", 50);
                    resposta = SC.nextInt();
                    if (resposta != 3) {
                        escreverMensagem("Essa não é a resposta correta, e você acaba não percorrendo o percurso. Por um momento, você sente sendo esmagado pela bola, até perceber que apenas tomou um susto com ela batendo na parede\n", 50);
                        Jogador.diminuirVida(1);
                    } else {
                        escreverMensagem("Por pouco, você escapa da bola, saindo da sala...\n", 50);
                    }
                } catch (InputMismatchException e) {
                    escreverMensagem("Resposta errada\n", 50);
                }
                escreverMensagem("ANDAR 3 - SALA 2\n", 50);
                while (resposta != 5) {
                    try {
                        escreverMensagem("""
                                               Um símbolo mágico brilha na parede: (2 + 3i) + (3 - i)
                                               Qual é a parte real do resultado?
                                               """, 50);
                        resposta = SC.nextInt();
                        if (resposta != 5) {
                            escreverMensagem("Não, revise a soma das partes reais e imaginárias.\n", 50);
                        }
                    } catch (InputMismatchException e) {
                        SC.nextLine();
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }
                escreverMensagem("ANDAR 3 - SALA 3\n", 50);
                while (resposta != 12) {
                    try {
                        escreverMensagem("""
                                               A porta da sala se fecha ao entrar, e uma voz parecida com giz num quadro negro ecoa:
                                               \"Cada sala é diferente da anterior, e você deve descobrir como cada uma é maior que anterior.
                                               Eu te darei uma pequena ajuda: a equação que dá o tamanho das salas é dada por x^2 - 17x + 60 = 0.
                                               Qual o maior valor que podemos obter dessa forma?\"\n""", 50);
                        resposta = SC.nextInt();
                        if (resposta != 12) {
                            escreverMensagem("A voz ecoa novamente: \n\"Você realmente pensou que fosse tão fácil? Roubarei um pouco de sua vida e tente novamente.\n", 50);
                            Jogador.diminuirVida(4);
                        }
                    } catch (InputMismatchException e) {
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }
                escreverMensagem("ANDAR 3 - SALA 4\n", 50);
                while (resposta != 5040) {
                    try {
                        escreverMensagem("A última sala. Finalmente estamos perto do fim.\n", 50);
                        escreverMensagem("Parece que ela possui um único cofre.\n", 50);
                        escreverMensagem("Infelizmente, não possuimos nenhuma pista de qual pode ser a senha... A única coisa que sabemos é que é uma senha de 4 números e que, provavelmente, nenhum deles se repete\n", 50);
                        escreverMensagem("Você sabe quantas são as possibilidades de senhas, " + Jogador.getNome() + "?\n", 50);
                        resposta = SC.nextInt();
                        if (resposta != 5040) {
                            escreverMensagem("Esse não parece o número real de possibilidades", 50);
                        }
                    } catch (InputMismatchException e) {
                        escreverMensagem("Opção inválida\n", 50);
                    }
                }
                escreverMensagem("Após muito e muito tempo tentando, você consegue abrir o cofre, onde há apenas um único pedaço de papel rasgado...\n", 50);
                escreverMensagem("O papel diz: \"Eu sabia que alguém tentaria vir atrás de mim. Você não me achará hoje, mas poderá me encontrar com seu próximo grande pesadelo: o gladiador Calculus\"", 50);
                escreverMensagem("Esse é o fim dessa história... Por enquanto\n", 50);
                System.exit(0);
            } catch (InputMismatchException e) {
                escreverMensagem("Algo errado aconteceu. Por favor, reinicie o jogo", 50);
                System.exit(0);
            }
        }
    }

    public static void escreverMensagem(String texto, long descanso) {
        for (char caracter : texto.toCharArray()) {
            System.out.print(caracter);
            System.out.flush();
            try {
                Thread.sleep(descanso);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}