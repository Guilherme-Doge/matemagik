public class Arma extends Item {
    private double alcance;
    private int municao;

    public Arma(String nome, String descricao, double alcance, int municao) {
        super(nome, descricao);
        this.alcance = alcance;
        this.municao = municao;
    }
}
