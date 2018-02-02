package View;

import Controller.ControllerGaragem;


import java.io.IOException;
import java.util.Scanner;


class MenuGaragem {
    private ControllerGaragem funcoesGaragem = new ControllerGaragem();

    void menu() throws IOException {
        Scanner option = new Scanner(System.in);
        int op;

        while (true) {
            System.out.println("###############################");
            System.out.println("########### GARAGEM ###########");
            System.out.println("#####    1 - CADASTRAR  #######");
            System.out.println("#####    2 - LISTAR     #######");
            System.out.println("#####    3 - EDITAR     #######");
            System.out.println("#####    4 - EXCLUIR    #######");
            System.out.println("#####    5 - BUSCAR     #######");
            System.out.println("#####    6 - CARROS     #######");
            System.out.println("#####    7 - VOLTAR     #######");
            System.out.println("##### 8 - Sair do programa ####");
            System.out.println("###############################");

            System.out.println("Digite uma opção: ");
            op = Integer.parseInt(option.next());

            switch (op) {
                case 1:
                    funcoesGaragem.inserirGaragem();
                    break;
                case 2:
                    funcoesGaragem.listarGaragem();
                    break;
                case 3:
                    funcoesGaragem.editarGaragem();
                    break;
                case 4:
                    funcoesGaragem.excluirGaragem();
                    break;
                case 5:
                    funcoesGaragem.buscarGaragem();
                    break;
                case 6:
                    funcoesGaragem.listarcarros();
                    break;
                case 7:
                    System.out.println("\n Voltando \n");
                    return;
                case 8:
                    System.out.println("\n Fechando programa! \n");
                    System.exit(8);
                default:
                    System.out.println("\n Opção invalida!! \n");
            }

        }
    }

}
