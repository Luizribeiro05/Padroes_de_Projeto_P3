package ServicoMeteorologico.App;

import ServicoMeteorologico.App.Implementacoes.*;
import ServicoMeteorologico.App.Observer.*;

public class AppPrevisaoTempo {
    public static void main(String[] args) {
        CondutoMeteorologicoObservable condicoesMeteorologicas = new CondutoMeteorologicoObservable();

        // Criando observadores
        Observador interfaceUsuario = new InterfaceUsuario();
        Observador servicoNotificacaoEmail = new ServicoNotificacaoEmail();
        Observador servicoGravacaoDadosMeteorologicos = new ServicoGravacaoDadosMeteorologicos();

        // Adicionando observadores ao sujeito observável
        condicoesMeteorologicas.adicionarObservador(interfaceUsuario);
        condicoesMeteorologicas.adicionarObservador(servicoNotificacaoEmail);
        condicoesMeteorologicas.adicionarObservador(servicoGravacaoDadosMeteorologicos);

        // Simulando uma atualização nas condições meteorológicas
        condicoesMeteorologicas.setCondicaoAtual("Ensolarado");

        // Resultado esperado:
        // Interface do Usuário: Condição meteorológica atualizada - Ensolarado
        // Serviço de Notificação por E-mail: Enviando e-mail sobre a condição meteorológica - Ensolarado
        // Serviço de Gravação de Dados Meteorológicos: Registrando dados - Ensolarado
    }
}
