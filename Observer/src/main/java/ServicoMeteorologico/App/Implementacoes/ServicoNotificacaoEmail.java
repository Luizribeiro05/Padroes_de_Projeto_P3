package ServicoMeteorologico.App.Implementacoes;

import ServicoMeteorologico.App.Observer.Observador;

public class ServicoNotificacaoEmail implements Observador {

    @Override
    public void atualizar(String novaCondicao) {
        System.out.println("Serviço de Notificação por E-mail: Enviando e-mail sobre a condição meteorológica - " + novaCondicao);
        // Lógica para enviar e-mail de notificação
    }
}