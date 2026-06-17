package second_exam.observer;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private List<Observer> observers = new ArrayList<>();
    private int pontosP1 = 0;
    private int pontosP2 = 0;

    public void adicionarObserver(Observer o) {
        // Implementação para adicionar um observador
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        // Implementação para remover um observador
        observers.remove(o);
    }

    public void notificarObservers() {
        // Implementação para notificar todos os observadores
        for (Observer obs : observers) {
            obs.update(pontosP1, pontosP2);
        }
    }

    public void registrarPontoP1() {
        pontosP1++;
        notificarObservers(); // Notifica os observadores sobre a mudança de estado
    }

    public void registrarPontoP2() {
        pontosP2++;
        notificarObservers(); // Notifica os observadores sobre a mudança de estado
    }
}