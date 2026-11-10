package questao2;

import java.math.BigDecimal;
import java.util.Objects;

public class Tiquete {

    private final String placa;
    private final int minutos;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutos, PerfilCobranca perfil) {
        if (minutos < 0) {
            throw new IllegalArgumentException("O tempo de permanência não pode ser negativo: " + minutos);
        }
        this.placa = Objects.requireNonNull(placa);
        this.minutos = minutos;
        this.perfil = Objects.requireNonNull(perfil);
    }

    public void alterarPerfil(PerfilCobranca novoPerfil) {
        this.perfil = Objects.requireNonNull(novoPerfil);
    }

    public BigDecimal valorAPagar() {
        return perfil.calcular(minutos);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }

    public PerfilCobranca getPerfil() {
        return perfil;
    }
}
