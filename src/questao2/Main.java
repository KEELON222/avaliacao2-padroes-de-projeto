package questao2;

import java.util.Locale;

public class Main {

    private static final Locale BRASIL = Locale.forLanguageTag("pt-BR");

    public static void main(String[] args) {
        int permanencia = 150;
        PerfilCobranca[] perfis = {new Rotativo(), new Mensalista(), new Conveniado()};

        System.out.printf("Mesmo tempo de permanência (%d min) nos três perfis:%n", permanencia);
        for (PerfilCobranca perfil : perfis) {
            imprimir(new Tiquete("ABC1D23", permanencia, perfil));
        }

        System.out.println();
        System.out.println("Troca de perfil em um mesmo tíquete:");
        Tiquete tiquete = new Tiquete("XYZ9K87", 95, new Rotativo());
        imprimir(tiquete);
        tiquete.alterarPerfil(new Conveniado());
        imprimir(tiquete);
        tiquete.alterarPerfil(new Mensalista());
        imprimir(tiquete);

        System.out.println();
        System.out.println("Conveniado dentro dos minutos gratuitos:");
        imprimir(new Tiquete("DEF4G56", 25, new Conveniado()));
    }

    private static void imprimir(Tiquete tiquete) {
        System.out.printf(BRASIL, "  %s | %3d min | %-10s | R$ %6.2f%n",
                tiquete.getPlaca(), tiquete.getMinutos(), tiquete.getPerfil().getNome(), tiquete.valorAPagar());
    }
}
