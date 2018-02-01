package Controller;

import Services.Garagem;
import Services.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Controller.ControllerGaragem.garagemList;

public class ControllerVeiculo {
    Veiculo veiculo;
    static List<Veiculo> veiculoList = new ArrayList<>();
    Scanner leitura = new Scanner(System.in);
    int i;

    public void insereVeiculo() {
        veiculo = new Veiculo();
        System.out.println("Garagem: ");
        veiculo.setGaragem(leitura.nextLine());
        for (i = 0; i < garagemList.size(); i++) {
            if (garagemList.get(i).getNome().equals(veiculoList.get(i).getGaragem())){
                continue;
            } else {
                System.out.println("Garagem não existe\n");
                return;
            }
        }
        System.out.println(" Nome: ");
        veiculo.setNome(leitura.nextLine());
        System.out.println(" Marca: ");
        veiculo.setMarca(leitura.nextLine());
        System.out.println(" Ano: ");
        veiculo.setAno(leitura.nextLine());
        System.out.println(" Opcionais: ");
        veiculo.setOpciononais(leitura.nextLine());
        System.out.println(" Portas");
        veiculo.setPortas(leitura.nextInt());

        veiculoList.add(veiculo);

        System.out.println("\n");
        leitura.nextLine();

    }

    public void listaVeiculo() {
        if (veiculoList.isEmpty()) {
            System.out.println("\nNão existe veiculos cadastrados!\n");
            leitura.nextLine();
        } else {
            for (i = 0; i < veiculoList.size(); i++) {
                System.out.println((i + 1) + "\n Nome: " + veiculoList.get(i).getNome().toUpperCase());
                System.out.println(" Marca: " + veiculoList.get(i).getMarca());
                System.out.println(" Ano: " + veiculoList.get(i).getAno());
                System.out.println(" Portas: " + veiculoList.get(i).getPortas());
                System.out.println(" Opcionais: " + veiculoList.get(i).getOpciononais());
            }
        }

    }

    public void editaVeiculo() {
        try {
            listaVeiculo();
            System.out.println("Digite o ID do veiculo que deseja alterar? ");
            i = Integer.parseInt(leitura.nextLine()) - 1;
            System.out.println(" Nome: ");
            veiculo.setNome(leitura.nextLine());
            System.out.println(" Marca: ");
            veiculo.setMarca(leitura.nextLine());
            System.out.println(" Ano: ");
            veiculo.setAno(leitura.nextLine());
            System.out.println(" Portas");
            veiculo.setPortas(leitura.nextInt());
            System.out.println(" Opcionais: ");
            veiculo.setOpciononais(leitura.nextLine());
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

        veiculoList.set(i, veiculo);

    }

    public void excluiVeiculo() {
        if (veiculoList.isEmpty()) {
            System.out.println(" \n Não existe veiculos cadastrados!\n");
            return;
        }
        System.out.printf("\nInforme o ID do veiculo a ser excluído: \n");
        i = leitura.nextInt();

        try {
            veiculoList.remove(i - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("\nErro: posição inválida (%s).\n", e.getMessage());
        }

    }

    public void buscaVeiculo() {
        String busca;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome ou marca do veiculo para pesquisar: ");
        busca = entrada.nextLine();
        for (i = 0; i < veiculoList.size(); i++) {
            if (veiculoList.get(i).getNome().contains(busca) || veiculoList.get(i).getMarca().contains(busca)) {
                System.out.println("Resultado: ");
                System.out.println(i + 1);
                System.out.println(" Nome: " + veiculoList.get(i).getNome().toUpperCase());
                System.out.println(" Marca: " + veiculoList.get(i).getMarca());
                System.out.println(" Ano: " + veiculoList.get(i).getAno());
                System.out.println(" Portas: " + veiculoList.get(i).getPortas());
                System.out.println(" Opcionais: " + veiculoList.get(i).getOpciononais());

            }
        }

    }
}
