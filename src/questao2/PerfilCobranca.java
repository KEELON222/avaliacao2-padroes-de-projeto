package questao2;

import java.math.BigDecimal;

public interface PerfilCobranca {

    String getNome();

    BigDecimal calcular(int minutos);

    static int horasIniciadas(int minutos) {
        return (minutos + 59) / 60;
    }
}
