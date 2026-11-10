package questao3;

import java.math.BigDecimal;

public class Chantilly extends Complemento {

    public static final BigDecimal PRECO = new BigDecimal("3.00");

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly";
    }

    @Override
    public BigDecimal getPreco() {
        return bebida.getPreco().add(PRECO);
    }
}
