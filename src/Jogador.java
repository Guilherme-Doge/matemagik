import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private static List<Item> inventario = new ArrayList<Item>();
    private static int vida = 10;
    private static String nome;

    static {
        Item cordaPequena = new Item("Corda Pequena", "Uma corda de 1 metro");
        Item cordaMedia = new Item("Corda Média", "Uma corda de 5 metros");
        Item cordaGrande = new Item("Corda Grande", "Uma corda de 10 metros");
        Arma espada = new Arma("Espada Enferrujada", "Uma espada de família que já está enferrujada", 0, 0);
        Arma arco = new Arma("Arco e felcha", "Arco e flecha de madeira", 18, 20);
        Item lamparina = new Item("Lamparina", "Uma lamparina que ilumina até 9 metros de distância");
        inventario.add(cordaPequena);
        inventario.add(cordaMedia);
        inventario.add(cordaGrande);
        inventario.add(espada);
        inventario.add(arco);
        inventario.add(lamparina);
    }

    public static List<Item> getInventario() {
        return inventario;
    }

    public static void setInventario(List<Item> inventario) {
        Jogador.inventario = inventario;
    }

    public static int getVida() {
        return vida;
    }

    public static void setVida(int vida) {
        Jogador.vida = vida;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Jogador.nome = nome;
    }

    public static void diminuirVida(int quantidade) {
        if ((Jogador.getVida() - quantidade) <= 0) {
            Executavel.escreverMensagem("Sua vida chegou em 0. Infelizmente, você perdeu... Boa sorte na próxima tentativa", 50);
            System.exit(0);
        } else {
            Jogador.vida -= quantidade;
        }
    }
}
