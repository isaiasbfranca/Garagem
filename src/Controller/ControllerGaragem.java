package Controller;

import Services.Garagem;
import Services.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Controller.ControllerVeiculo.veiculoList;

public class ControllerGaragem {
    static Garagem novaGaragem;
    static List<Garagem> garagemList = new ArrayList<Garagem>();
    Scanner leitura = new Scanner(System.in);
    int i;

    public void inserirGaragem() {
        novaGaragem = new Garagem();
        System.out.println("Nome: ");
        novaGaragem.setNome(leitura.nextLine());
        System.out.println("Endereço: ");
        novaGaragem.setEndereco(leitura.nextLine());
        System.out.println("Telefone: ");
        novaGaragem.setTelefone(leitura.nextLine());
        System.out.println("CNPJ: ");
        novaGaragem.setCnpj(leitura.nextLine());

        garagemList.add(novaGaragem);

        System.out.println("\n");
        leitura.nextLine();
    }

    public void listarGaragem() {
        if (garagemList.isEmpty()) {
            System.out.println("Não existe garagens cadastradas!!");
            leitura.nextLine();
        } else {
            for (i = 0; i < garagemList.size(); i++) {
                System.out.println((i + 1));
                System.out.println("NOME: " + garagemList.get(i).getNome().toUpperCase());
                System.out.println("CNPJ: " + garagemList.get(i).getCnpj());
                System.out.println("ENDEREÇO: " + garagemList.get(i).getEndereco());
                System.out.println("TELEFONE: " + garagemList.get(i).getTelefone());
            }
        }

    }

    public void editarGaragem() {

        try {
            listarGaragem();
            System.out.printf("\nInforme o ID do item a ser alterado :\n");
            i = Integer.parseInt(leitura.nextLine()) - 1;
            System.out.println("Nome: ");
            novaGaragem.setNome(leitura.nextLine());
            System.out.println("Endereço: ");
            novaGaragem.setEndereco(leitura.nextLine());
            System.out.println("Telefone: ");
            novaGaragem.setTelefone(leitura.nextLine());
            System.out.println("CNPJ: ");
            novaGaragem.setCnpj(leitura.nextLine());
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

        garagemList.set(i, novaGaragem);

    }

    public void excluirGaragem() {
        if (garagemList.isEmpty()) {
            System.out.println(" \nO cadastro está vazio\n ");
            return;
        }

        System.out.printf("\nInforme a posição a ser excluída:\n");
        i = leitura.nextInt();
        try {
            // [ D ] remove o i-ésimo contato da agenda
            garagemList.remove(i - 1);
        } catch (IndexOutOfBoundsException e) {
            // exceção lançada para indicar que um índice (i)
            // está fora do intervalo válido (de 0 até agenda.size()-1)
            System.out.printf("\nErro: posição inválida (%s).\n",
                    e.getMessage());
        }

    }

    public void buscarGaragem() {
        String busca;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Nome da garagem ou CNPJ para pesquisar: ");
        busca = entrada.nextLine();
        for (i = 0; i < garagemList.size(); i++) {
            if (garagemList.get(i).getNome().contains(busca) || garagemList.get(i).getCnpj().contains(busca)) {
                System.out.println("Resultado: ");
                System.out.println((i + 1));
                System.out.println("NOME: " + garagemList.get(i).getNome());
                System.out.println("CNPJ: " + garagemList.get(i).getCnpj());
                System.out.println("ENDEREÇO: " + garagemList.get(i).getEndereco());
                System.out.println("TELEFONE: " + garagemList.get(i).getTelefone());
            }

        }
    }

    public void listarcarros() {
        String cadastrogaragem;
        if (garagemList.isEmpty()) {
            System.out.println("\n Não ha garagens cadastradas\n");
            return;
        }
        listarGaragem();
        System.out.println("\n Listar carros de qual garagem? ");
        cadastrogaragem = leitura.nextLine();
        if (novaGaragem.getNome().equals(cadastrogaragem)) {
            if (veiculoList.isEmpty()) {
                System.out.println("\n Não ha carros cadastrados\n");
                return;
            } else {
                for (i = 0; i < garagemList.size(); i++) {
                    for (int j = 0; j < veiculoList.size(); j++) {
                        System.out.println((i + 1) + "Garagem " + garagemList.get(i).getNome());
                        System.out.println(veiculoList.toString());
                    }
                }
            }
        }else {
            System.out.println("\nERRO!!\n");
            System.out.println("\nDigite o nome exato da garagem\n");
            return;
        }
    }
}
