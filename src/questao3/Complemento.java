package questao3;

import java.util.Objects;

public abstract class Complemento implements Bebida {

    protected final Bebida bebida;

    protected Complemento(Bebida bebida) {
        this.bebida = Objects.requireNonNull(bebida);
    }
}
