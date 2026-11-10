package questao1;

public class Compras implements AreaInteressada {

    public static final int ESTOQUE_MINIMO = 5;

    @Override
    public void estoqueAlterado(String produto, int quantidadeAnterior, int novaQuantidade) {
        if (novaQuantidade < ESTOQUE_MINIMO) {
            System.out.printf("[Compras] Alerta: %s está com %d unidade(s), abaixo do mínimo de %d.%n",
                    produto, novaQuantidade, ESTOQUE_MINIMO);
        }
    }
}
