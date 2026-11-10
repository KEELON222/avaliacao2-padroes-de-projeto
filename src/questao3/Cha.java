package questao3;

import java.math.BigDecimal;

public class Cha implements Bebida {

    public static final BigDecimal PRECO = new BigDecimal("5.00");

    @Override
    public String getDescricao() {
        return "Chá";
    }

    @Override
    public BigDecimal getPreco() {
        return PRECO;
    }
}
