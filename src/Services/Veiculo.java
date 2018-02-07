package Services;

public class Veiculo {
    private String nome;
    private String marca;
    private String ano;
    private String portas;
    private String opciononais;
    private String garagem;

    public Veiculo() {
        this.setNome("");
        this.setMarca("");
        this.setAno("");
        this.setPortas("");
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

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    public String getOpciononais() {
        return opciononais;
    }

    public void setOpciononais(String opciononais) {
        this.opciononais = opciononais;
    }


}