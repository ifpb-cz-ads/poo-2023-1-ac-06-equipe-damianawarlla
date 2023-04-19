public class TimeDeEsporte {
    private String nomeEquipe;
    private int numeroJogadores;
    private String jogadores[] = new String[numeroJogadores];
    private String treinador;

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void mudarNome(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public void adicionarJogadorNaPosicao(String jogador, int posicao) {
        jogadores[posicao] = jogador;
    }

    public String getTreinador() {
        return treinador;
    }

    public void substituirTreinador(String treinador) {
        this.treinador = treinador;
    }
}
