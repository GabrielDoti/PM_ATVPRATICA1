package atividadepratica;

import java.util.ArrayList;
import java.util.List;

public class Salao {
    private int numero;
    private int capacidadeMaxima;
    private String localizacao;
    private String tipo;
    private Organizador organizador;
    private List<Reserva> reservas;

    public Salao() {
        this.reservas = new ArrayList<>();
    }

    public Salao(int numero, int capacidadeMaxima, String localizacao, String tipo) {
        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
        this.localizacao = localizacao;
        this.tipo = tipo;
        this.reservas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean associarOrganizador(Organizador org) {
        if (this.organizador != null || org.getSalao() != null) {
            return false;
        }
        this.organizador = org;
        org.setSalao(this);
        return true;
    }

    public boolean temConflito(Reserva nova) {
        for (Reserva r : reservas) {
            if (r.getData().equals(nova.getData()) && r.getHorario().equalsIgnoreCase(nova.getHorario())) {
                return true;
            }
        }
        return false;
    }
    
    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
    }
}
