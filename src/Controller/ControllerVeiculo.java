package Controller;

import Services.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Controller.ControllerGaragem.garagemList;

public class ControllerVeiculo {
    private static Veiculo veiculo;
    static List<Veiculo> veiculoList = new ArrayList<>();
    private Scanner leitura = new Scanner(System.in);
    private int i;


    public void insereVeiculo() {
        veiculo = new Veiculo();
        System.out.println(" Garagem : ");
        veiculo.setGaragem(leitura.nextLine());
        if (garagemList.isEmpty()) {
            System.out.println("\n Nenhuma garagem cadastrada \n");
            return;
        } else {
            for (i = 0; i < garagemList.size(); i++) {
                if (garagemList.get(i).getNome().contains(veiculo.getGaragem())) {
                    break;
                }
//                else {
//                    for (int j = 0; j < garagemList.size(); j--){
//                        if (!garagemList.get(i).getNome().contains(veiculo.getGaragem())){
//                            System.out.println("Garagem inexistente");
//                            System.exit(j);
//
//                        }
//                    }
//                }
            }
        }
        System.out.println(" Nome : ");
        veiculo.setNome(leitura.nextLine());
        System.out.println(" Marca : ");
        veiculo.setMarca(leitura.nextLine());
        System.out.println(" Ano : ");
        veiculo.setAno(leitura.nextLine());
        System.out.println(" Opcionais : ");
        veiculo.setOpciononais(leitura.nextLine());
        System.out.println(" Portas : ");
        veiculo.setPortas(leitura.nextLine());

        System.out.println("\n");

        veiculoList.add(veiculo);
    }

    public void listaVeiculo() {
        if (veiculoList.isEmpty()) {
            System.out.println("\nNão existe veiculos cadastrados!\n");
        } else {
            for (i = 0; i < veiculoList.size(); i++) {
                System.out.println((i + 1) + "\n Nome : " + veiculoList.get(i).getNome().toUpperCase());
                System.out.println(" Marca : " + veiculoList.get(i).getMarca());
                System.out.println(" Ano : " + veiculoList.get(i).getAno());
                System.out.println(" Portas : " + veiculoList.get(i).getPortas());
                System.out.println(" Opcionais : " + veiculoList.get(i).getOpciononais());
            }
        }

    }

    public void editaVeiculo() {
        try {
            listaVeiculo();
            System.out.println("Digite o ID do veiculo que deseja alterar? ");
            i = Integer.parseInt(leitura.nextLine()) - 1;
            System.out.println(" Nome : ");
            veiculo.setNome(leitura.nextLine());
            System.out.println(" Marca : ");
            veiculo.setMarca(leitura.nextLine());
            System.out.println(" Ano : ");
            veiculo.setAno(leitura.nextLine());
            System.out.println(" Opcionais : ");
            veiculo.setOpciononais(leitura.nextLine());
            System.out.println(" Portas :");
            veiculo.setPortas(leitura.nextLine());
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
                System.out.println((i + 1) + "\n Nome: " + veiculoList.get(i).getNome().toUpperCase());
                System.out.println(" Marca: " + veiculoList.get(i).getMarca());
                System.out.println(" Ano: " + veiculoList.get(i).getAno());
                System.out.println(" Portas: " + veiculoList.get(i).getPortas());
                System.out.println(" Opcionais: " + veiculoList.get(i).getOpciononais());

            }
        }

    }
}
