package Services;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String cep;

    public Cliente() {
        this.setNome("");
        this.setCpf("");
        this.setTelefone("");
        this.setEndereco("");
        this.setCep("");
    }

    public Cliente(String nome, String endereco, String cep, String cpf, String telefone) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setCep(cep);
        this.setCpf(cpf);
        this.setTelefone(telefone);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
