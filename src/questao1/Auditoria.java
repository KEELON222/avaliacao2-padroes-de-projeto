package questao1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Auditoria implements AreaInteressada {

    private final List<String> registros = new ArrayList<>();

    @Override
    public void estoqueAlterado(String produto, int quantidadeAnterior, int novaQuantidade) {
        String registro = String.format("%s: %d -> %d", produto, quantidadeAnterior, novaQuantidade);
        registros.add(registro);
        System.out.println("[Auditoria] Registrado: " + registro);
    }

    public List<String> getRegistros() {
        return Collections.unmodifiableList(registros);
    }
}
