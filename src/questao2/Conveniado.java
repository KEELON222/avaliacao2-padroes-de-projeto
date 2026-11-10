package questao2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conveniado implements PerfilCobranca {

    public static final int MINUTOS_GRATUITOS = 30;
    public static final BigDecimal VALOR_POR_HORA = new BigDecimal("8.00");
    public static final BigDecimal PERCENTUAL_DESCONTO = new BigDecimal("25");

    private static final BigDecimal CEM = new BigDecimal("100");

    @Override
    public String getNome() {
        return "Conveniado";
    }

    @Override
    public BigDecimal calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATUITOS);
        BigDecimal valorCheio = VALOR_POR_HORA.multiply(BigDecimal.valueOf(PerfilCobranca.horasIniciadas(minutosCobrados)));
        BigDecimal fatorComDesconto = CEM.subtract(PERCENTUAL_DESCONTO).divide(CEM);
        return valorCheio.multiply(fatorComDesconto).setScale(2, RoundingMode.HALF_UP);
    }
}
