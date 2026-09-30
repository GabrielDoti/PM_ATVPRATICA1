package atividadepratica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int codigo;
    private String nomeCliente;
    private LocalDate data;
    private String horario;
    private int quantidadeConvidados;
    private String status;
    private double valorTotal;
    private Salao salao;

    public Reserva(int codigo, String nomeCliente, LocalDate data, String horario,
                   int quantidadeConvidados, double valorTotal) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.horario = horario;
        this.quantidadeConvidados = quantidadeConvidados;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getQuantidadeConvidados() {
        return quantidadeConvidados;
    }

    public void setQuantidadeConvidados(int quantidadeConvidados) {
        this.quantidadeConvidados = quantidadeConvidados;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Salao getSalao() {
        return salao;
    }

    public void setSalao(Salao salao) {
        this.salao = salao;
    }

    public String detalhes() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.toString());
        if (salao != null) {
            sb.append("\n   ").append(salao);
            if (salao.getOrganizador() != null) {
                sb.append("\n   ").append(salao.getOrganizador());
            }
        } else {
            sb.append("\n   Salão: não atribuído");
        }
        return sb.toString();
    }
}
