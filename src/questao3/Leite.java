package questao3;

import java.math.BigDecimal;

public class Leite extends Complemento {

    public static final BigDecimal PRECO = new BigDecimal("2.00");

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite";
    }

    @Override
    public BigDecimal getPreco() {
        return bebida.getPreco().add(PRECO);
    }
}
