package questao2;

import java.math.BigDecimal;

public class Mensalista implements PerfilCobranca {

    public static final BigDecimal VALOR_FIXO = new BigDecimal("5.00");

    @Override
    public String getNome() {
        return "Mensalista";
    }

    @Override
    public BigDecimal calcular(int minutos) {
        return VALOR_FIXO;
    }
}
