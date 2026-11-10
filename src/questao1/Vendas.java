package questao1;

public class Vendas implements AreaInteressada {

    @Override
    public void estoqueAlterado(String produto, int quantidadeAnterior, int novaQuantidade) {
        if (quantidadeAnterior == 0 && novaQuantidade > 0) {
            System.out.printf("[Vendas] Alerta: %s voltou a ter estoque, agora com %d unidade(s).%n",
                    produto, novaQuantidade);
        }
    }
}
