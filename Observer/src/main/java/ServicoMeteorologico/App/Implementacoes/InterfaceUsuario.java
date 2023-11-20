package ServicoMeteorologico.App.Implementacoes;

import ServicoMeteorologico.App.Observer.Observador;

public class InterfaceUsuario implements Observador {

    @Override
    public void atualizar(String novaCondicao) {
        System.out.println("Interface do Usuário: Condição meteorológica atualizada - " + novaCondicao);
        // Lógica para atualizar a interface do usuário
    }
}
