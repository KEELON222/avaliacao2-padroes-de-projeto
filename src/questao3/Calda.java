package questao3;

import java.math.BigDecimal;

public class Calda extends Complemento {

    public static final BigDecimal PRECO = new BigDecimal("2.50");

    public Calda(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Calda";
    }

    @Override
    public BigDecimal getPreco() {
        return bebida.getPreco().add(PRECO);
    }
}
