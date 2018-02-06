package Services;

public class Veiculo {
    private String nome;
    private String marca;
    private String ano;
    private int portas;
    private String opciononais;
    private String garagem;

    public Veiculo() {
        this.setNome("");
        this.setMarca("");
        this.setAno("");
        this.setPortas(0);
        this.setOpciononais("");
    }

    public String getGaragem() {
        return garagem.toUpperCase();
    }

    public void setGaragem(String garagem) {
        this.garagem = garagem;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca.toUpperCase();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getOpciononais() {
        return opciononais;
    }

    public void setOpciononais(String opciononais) {
        this.opciononais = opciononais;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", ano='" + ano + '\'' +
                ", portas=" + portas +
                ", opciononais='" + opciononais + '\'' +
                ", garagem='" + garagem + '\'' +
                '}';
    }
}