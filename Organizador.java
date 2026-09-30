package atividadepratica;

public class Organizador {
    private String nome;
    private String cpf;
    private String telefone;
    private String areaAtuacao;
    private Salao salao;

    public Organizador(String nome, String cpf, String telefone, String areaAtuacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.areaAtuacao = areaAtuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Salao getSalao() {
        return salao;
    }

    public void setSalao(Salao salao) {
        this.salao = salao;
    }
}
