package questao1;

public class Main {

    public static void main(String[] args) {
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        Produto teclado = new Produto("Teclado", 10);
        teclado.adicionarArea(compras);
        teclado.adicionarArea(vendas);
        teclado.adicionarArea(auditoria);

        Produto mouse = new Produto("Mouse", 8);
        mouse.adicionarArea(compras);
        mouse.adicionarArea(auditoria);

        System.out.println("Teclado: Compras, Vendas e Auditoria acompanhando");
        System.out.println("Mouse: Compras e Auditoria acompanhando");

        alterar(teclado, 7);
        alterar(teclado, 3);

        System.out.println();
        System.out.println("> Teclado recebe a mesma quantidade (3): nenhuma área deve ser avisada");
        teclado.alterarQuantidade(3);

        alterar(teclado, 0);
        alterar(teclado, 12);
        alterar(mouse, 4);

        System.out.println();
        System.out.println("Compras deixa de acompanhar o Teclado.");
        teclado.removerArea(compras);
        alterar(teclado, 2);

        System.out.println();
        System.out.println("Vendas passa a acompanhar o Mouse.");
        mouse.adicionarArea(vendas);
        alterar(mouse, 0);
        alterar(mouse, 6);

        System.out.println();
        System.out.println("Registros da Auditoria:");
        for (String registro : auditoria.getRegistros()) {
            System.out.println("  " + registro);
        }
    }

    private static void alterar(Produto produto, int novaQuantidade) {
        System.out.println();
        System.out.printf("> %s: %d -> %d%n", produto.getNome(), produto.getQuantidade(), novaQuantidade);
        produto.alterarQuantidade(novaQuantidade);
    }
}
