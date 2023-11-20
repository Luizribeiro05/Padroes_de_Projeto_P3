package ServicoMeteorologico.App.Implementacoes;

import ServicoMeteorologico.App.Observer.Observador;

public class ServicoGravacaoDadosMeteorologicos implements Observador {

    @Override
    public void atualizar(String novaCondicao) {
        System.out.println("Serviço de Gravação de Dados Meteorológicos: Registrando dados - " + novaCondicao);
        // Lógica para gravar dados meteorológicos
    }
}