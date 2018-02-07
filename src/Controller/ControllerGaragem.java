package Controller;

import Services.Garagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static Controller.ControllerVeiculo.veiculoList;

public class ControllerGaragem {
    private Garagem novaGaragem;
    static List<Garagem> garagemList = new ArrayList<>();
    private Scanner leitura = new Scanner(System.in);
    private int i;

    public void inserirGaragem() {
        //Cria uma nova Garagem
        novaGaragem = new Garagem();
        //Solicita a digitação de dados
        try {
            System.out.println(" Nome : ");
            novaGaragem.setNome(leitura.nextLine());
            System.out.println(" Endereço : ");
            novaGaragem.setEndereco(leitura.nextLine());
            System.out.println(" Telefone : ");
            novaGaragem.setTelefone(leitura.nextLine());
            System.out.println(" CNPJ : ");
            novaGaragem.setCnpj(leitura.nextLine());
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        //Adiciona informações da garagem
        garagemList.add(novaGaragem);
    }
    //Mètodo que imprime todos os registros do cadastro
    public void listarGaragem() {
        if (garagemList.isEmpty()) {
            System.out.println("\n Não existe garagens cadastradas!!\n");
        } else {
            for (i = 0; i < garagemList.size(); i++) {
                System.out.println((i + 1) + "\n Nome : " + garagemList.get(i).getNome().toUpperCase());
                System.out.println(" CNPJ : " + garagemList.get(i).getCnpj());
                System.out.println(" Endereço : " + garagemList.get(i).getEndereco());
                System.out.println(" Telefone : " + garagemList.get(i).getTelefone());
            }
        }

    }

    public void editarGaragem() {
        if (garagemList.isEmpty()) {
            System.out.println("\n Não existe garagens cadastradas!!\n");
            return;
        }
        try {
            listarGaragem();
            System.out.printf("\nInforme o ID do cliente a ser alterado :\n");
            i = Integer.parseInt(leitura.nextLine()) - 1;
            System.out.println(" Nome : ");
            novaGaragem.setNome(leitura.nextLine());
            System.out.println(" Endereço : ");
            novaGaragem.setEndereco(leitura.nextLine());
            System.out.println(" Telefone : ");
            novaGaragem.setTelefone(leitura.nextLine());
            System.out.println(" CNPJ : ");
            novaGaragem.setCnpj(leitura.nextLine());
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        garagemList.set(i, novaGaragem);

    }
    //Método que deleta uma garagem cadastrada
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
            if (garagemList.get(i).getNome().toUpperCase().contains(busca.toUpperCase()) || garagemList.get(i).getCnpj().contains(busca)) {
                System.out.println("Resultado: ");
                System.out.println((i + 1) + "\n Nome : " + garagemList.get(i).getNome().toUpperCase());
                System.out.println(" CNPJ : " + garagemList.get(i).getCnpj());
                System.out.println(" Endereço : " + garagemList.get(i).getEndereco());
                System.out.println(" Telefone : " + garagemList.get(i).getTelefone());
            }

        }
    }

    public void listarcarros() {
        if (garagemList.isEmpty()) {
            System.out.println("\n Não ha garagens cadastradas\n");
            return;
        }
        for (i = 0; i < garagemList.size(); i++) {
            System.out.println("Garagem " + garagemList.get(i).getNome().toUpperCase());
            if (veiculoList.isEmpty()) {
                System.out.println("\n Não ha carros cadastrados\n");
                return;
            }
            for (int j = 0; j < veiculoList.size(); j++) {
                if (garagemList.get(i).getNome().equalsIgnoreCase(veiculoList.get(j).getGaragem())) {
                    if (veiculoList.isEmpty()) {
                        System.out.println("\n Não ha carros cadastrados\n");
                        return;
                    } else {
                        System.out.println(veiculoList.get(j).getNome().toUpperCase() + " | " + veiculoList.get(j).getMarca().toUpperCase() + " | " + veiculoList.get(j).getAno());
                    }
                }
            }
        }
    }
}
