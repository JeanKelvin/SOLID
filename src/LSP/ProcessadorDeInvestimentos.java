package LSP;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        contasComum().forEach(conta -> {
            conta.rende();
            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        });
    }

    private static List<ContaComum> contasComum() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150));
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }
}
