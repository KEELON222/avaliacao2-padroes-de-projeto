package questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produto {

    private final String nome;
    private int quantidade;
    private final List<AreaInteressada> areas = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        validarQuantidade(quantidade);
        this.nome = Objects.requireNonNull(nome);
        this.quantidade = quantidade;
    }

    public void adicionarArea(AreaInteressada area) {
        Objects.requireNonNull(area);
        if (!areas.contains(area)) {
            areas.add(area);
        }
    }

    public void removerArea(AreaInteressada area) {
        areas.remove(area);
    }

    public void alterarQuantidade(int novaQuantidade) {
        validarQuantidade(novaQuantidade);
        if (novaQuantidade == quantidade) {
            return;
        }
        int anterior = quantidade;
        quantidade = novaQuantidade;
        notificarAreas(anterior);
    }

    private void notificarAreas(int quantidadeAnterior) {
        for (AreaInteressada area : new ArrayList<>(areas)) {
            area.estoqueAlterado(nome, quantidadeAnterior, quantidade);
        }
    }

    private static void validarQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa: " + quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
