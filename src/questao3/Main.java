package questao3;

import java.util.Locale;

public class Main {

    private static final Locale BRASIL = Locale.forLanguageTag("pt-BR");

    public static void main(String[] args) {
        Bebida[] pedidos = {
                new Leite(new Espresso()),
                new Calda(new Chantilly(new Cha())),
                new Chantilly(new Leite(new Leite(new Espresso()))),
                new Calda(new Calda(new Leite(new Cha())))
        };

        for (int i = 0; i < pedidos.length; i++) {
            System.out.printf(BRASIL, "Pedido %d: %s | R$ %.2f%n",
                    i + 1, pedidos[i].getDescricao(), pedidos[i].getPreco());
        }
    }
}
