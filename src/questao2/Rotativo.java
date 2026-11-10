package questao2;

import java.math.BigDecimal;

public class Rotativo implements PerfilCobranca {

    public static final BigDecimal VALOR_POR_HORA = new BigDecimal("8.00");

    @Override
    public String getNome() {
        return "Rotativo";
    }

    @Override
    public BigDecimal calcular(int minutos) {
        return VALOR_POR_HORA.multiply(BigDecimal.valueOf(PerfilCobranca.horasIniciadas(minutos)));
    }
}
