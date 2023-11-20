package ServicoMeteorologico.App.Observer;

import java.util.ArrayList;
import java.util.List;

public class CondutoMeteorologicoObservable {
    private List<Observador> observadores = new ArrayList<>();
    private String condicaoAtual;

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void setCondicaoAtual(String condicaoAtual) {
        this.condicaoAtual = condicaoAtual;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(condicaoAtual);
        }
    }
}
